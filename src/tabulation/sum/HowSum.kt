package tabulation.sum

object HowSum {
    fun getElements(targetSum: Int, numbers: Array<Int>): MutableList<Int>? {
        val table = Array<MutableList<Int>?>(targetSum + 1) { null }
        table[0] = mutableListOf()
        for (i in 0..targetSum) {
            if (table[i] != null) {
                for (n in numbers) {
                    if ((i + n) <= targetSum) {
                        // MUST DE_REFERENCE THE LIST
                        table[i + n] = table[i]!!.toMutableList()
                        table[i + n]!!.add(n)
                    }
                    if ((i + n) == targetSum) return table[targetSum]
                }
            }
        }
        return table[targetSum]
    }
}