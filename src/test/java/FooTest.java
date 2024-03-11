import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

class FooTest {

  @Property
  void test(@ForAll("i") int i) {
  }
  @Provide
  Arbitrary<Integer> i() {
    return Bar.ints();
  }

}
