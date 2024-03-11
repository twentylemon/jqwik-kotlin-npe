import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

import java.util.Set;

class FooTest {

  @Property
  void foo(@ForAll("arb") Set<Integer> i) {
    System.out.println(i);
  }

  @Provide
  Arbitrary<Set<Integer>> arb() {
    return ArbKt.arb();
  }

}
