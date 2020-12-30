package tabulation.sum

object BestSum {
    fun getBestCombination(targetSum: Int, numbers: Array<Int>): List<Int>? {
        val table = Array<MutableList<Int>?>(targetSum + 1) { null }
        table[0] = mutableListOf()
        for (i in 0..targetSum) {
            if (table[i] != null) {
                for (n in numbers) {
                    if ((n + i) <= targetSum) {
                        if (table[n + i] == null ||
                                table[n + i]!!.size > table[i]!!.size) {
                            table[n + i] = table[i]!!.toMutableList()
                            table[n + i]!!.add(n)
                        }
                    }
                }
            }
        }
        return table[targetSum]
    }
}