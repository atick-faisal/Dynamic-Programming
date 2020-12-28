import fibonacci.Fibonacci
import grid.GridTraveller
import sum.CanSum
import kotlin.system.measureTimeMillis

fun main() {
    var n = false
    val timeElapsed = measureTimeMillis {
        // val n = Fibonacci.optimizedGetAtPosition(50)
        // n = GridTraveller.getOptimizedNumberOfPaths(18, 18)
        // n = GridTraveller.getMoreOptimizedNumberOfPaths(18, 18)
        n = CanSum.isPossibleOptimized(300, arrayOf(7, 14))
    }

    print("ANSWER: $n, TIME: $timeElapsed ms")
}