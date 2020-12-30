import recursion.construct.AllConstruct
import recursion.construct.CountConstruct
import recursion.fibonacci.Fibonacci
import recursion.grid.GridTraveller
import recursion.sum.BestSum
import recursion.sum.CanSum
import recursion.sum.HowSum
import tabulation.fibonacci.Fibonacci as FibTable
import tabulation.grid.GridTraveller as GridTable
import tabulation.sum.CanSum as SumTable
import tabulation.sum.HowSum as HowSumTable
import kotlin.system.measureTimeMillis

fun main() {
    var n: Any? = null
    val timeElapsed = measureTimeMillis {
//        n = Fibonacci.getAtPosition(7)
//        n = Fibonacci.getAtPositionOptimized(100)
//        n = GridTraveller.getOptimizedNumberOfPaths(18, 18)
//        n = GridTraveller.getMoreOptimizedNumberOfPaths(18, 18)
//        n = CanSum.isPossibleOptimized(300, arrayOf(7, 14))
//        n = HowSum.getElementsOptimized(8, arrayOf(2, 3, 5))
        n = BestSum.getBestCombination(8, arrayOf(2, 5))
//        n = CountConstruct.getCountOptimized(
//                "asdf", arrayOf("as", "df", "asd", "f"))
//        n = AllConstruct.getAllWaysOptimized(
//                "asdf", arrayOf("as", "df", "asd", "f"))
//        n = FibTable.getAtPosition(100)
//        n = GridTable.getNumberOfPaths(18, 18)
//        n = SumTable.isPossible(300, arrayOf(7, 14))
//        n = HowSumTable.getElements(5, arrayOf(2, 3, 7))
    }
    print("RESULT: $n, TIME: $timeElapsed ms")
}