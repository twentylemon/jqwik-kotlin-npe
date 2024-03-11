import net.jqwik.api.Arbitraries
import net.jqwik.api.Arbitrary
import net.jqwik.kotlin.api.ofSize

fun arb(): Arbitrary<Set<Int>> = Arbitraries.integers().set().ofSize(2..5)
