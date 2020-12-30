package tabulation.sum

object CanSum {
    fun isPossible(targetSum: Int, numbers: Array<Int>): Boolean {
        val table = Array(targetSum + 1) { false }
        table[0] = true
        for (i in 0..targetSum) {
            if (table[i]) {
                for (n in numbers) {
                    if ((i + n) <= targetSum) table[i + n] = true
                }
            }
        }
        return table[targetSum]
    }
}