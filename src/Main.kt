import fibonacci.Fibonacci
import grid.GridTraveller
import kotlin.system.measureTimeMillis

fun main() {
    var n = 0L
    val timeElapsed = measureTimeMillis {
        // val n = Fibonacci.optimizedGetAtPosition(50)
        // n = GridTraveller.getOptimizedNumberOfPaths(18, 18)
        n = GridTraveller.getMoreOptimizedNumberOfPaths(18, 18)
    }

    print("ANSWER: $n, TIME: $timeElapsed ms")
}