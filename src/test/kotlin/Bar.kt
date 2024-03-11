import net.jqwik.api.Arbitraries
import net.jqwik.api.Arbitrary

object Bar {
  @JvmStatic
  fun ints(): Arbitrary<Int> = Arbitraries.integers()
}
