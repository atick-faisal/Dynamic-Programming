import fibonacci.Fibonacci
import grid.GridTraveller
import sum.CanSum
import sum.HowSum
import kotlin.system.measureTimeMillis

fun main() {
    var n: MutableList<Int>? = mutableListOf()
    val timeElapsed = measureTimeMillis {
        // val n = Fibonacci.optimizedGetAtPosition(50)
        // n = GridTraveller.getOptimizedNumberOfPaths(18, 18)
        // n = GridTraveller.getMoreOptimizedNumberOfPaths(18, 18)
        // n = CanSum.isPossibleOptimized(300, arrayOf(7, 14))
       n = HowSum.getElementsOptimized(8, arrayOf(2, 3, 5))
    }

    print("ANSWER: $n, TIME: $timeElapsed ms")
}