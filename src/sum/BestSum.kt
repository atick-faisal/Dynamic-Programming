package sum

object BestSum {
    fun getBestCombination(targetSum: Int, numbers: Array<Int>)
            : MutableList<Int>? {
        if (targetSum == 0) return mutableListOf()
        if (targetSum < 0) return null
        var bestCombination: MutableList<Int>? = null
        for (number in numbers) {
            val newTarget = targetSum - number
            val result = getBestCombination(newTarget, numbers)
            result?.let {
                it.add(number)
                if (it.size < bestCombination?.size ?: it.size + 1) {
                    bestCombination = it
                }
            }
        }
        return bestCombination
    }
}