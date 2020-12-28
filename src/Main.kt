import construct.CanConstruct
import fibonacci.Fibonacci
import grid.GridTraveller
import sum.BestSum
import sum.CanSum
import sum.HowSum
import kotlin.system.measureTimeMillis

fun main() {
    var n: Any? = null
    val timeElapsed = measureTimeMillis {
        // val n = Fibonacci.optimizedGetAtPosition(50)
        // n = GridTraveller.getOptimizedNumberOfPaths(18, 18)
        // n = GridTraveller.getMoreOptimizedNumberOfPaths(18, 18)
        // n = CanSum.isPossibleOptimized(300, arrayOf(7, 14))
        // n = HowSum.getElementsOptimized(8, arrayOf(2, 3, 5))
        // n = BestSum.getBestCombination(8, arrayOf(2, 3))
        n = CanConstruct.isConstructable("asf", arrayOf("as", "asd", "d"))
    }

    print("ANSWER: $n, TIME: $timeElapsed ms")
}