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
        n = CanSum.isPossible(7, arrayOf(2, 4))
    }

    print("ANSWER: $n, TIME: $timeElapsed ms")
}