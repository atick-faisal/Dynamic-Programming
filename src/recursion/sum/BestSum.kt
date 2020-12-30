package recursion.sum

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

//    fun getBestCombinationOptimized(
//            targetSum: Int,
//            numbers: Array<Int>,
//            memory: HashMap<Int, MutableList<Int>?> = hashMapOf()
//    ): MutableList<Int>? {
//        if (memory.containsKey(targetSum)) return memory[targetSum]
//        if (targetSum == 0) return mutableListOf()
//        if (targetSum < 0) return null
//        var bestCombination: MutableList<Int>? = null
//        for (number in numbers) {
//            val newTarget = targetSum - number
//            val result = getBestCombinationOptimized(newTarget, numbers, memory)
//            if (result != null) {
//                result.add(number)
//                if (bestCombination == null || result.size < bestCombination.size) {
//                    bestCombination = result
//                }
//            }
//        }
//        memory[targetSum] = bestCombination
//        return bestCombination
//    }

    fun getBestCombinationOptimized(
            targetSum: Int,
            numbers: Array<Int>,
            memory: HashMap<Int, MutableList<Int>?> = hashMapOf()
    ): MutableList<Int>? {
        if (memory.containsKey(targetSum)) return memory[targetSum]
        if (targetSum == 0) return mutableListOf()
        if (targetSum < 0) return null
        var bestCombination: MutableList<Int>? = null
        for (number in numbers) {
            val newTarget = targetSum - number
            val result = getBestCombinationOptimized(newTarget, numbers, memory)
            result?.let {
                it.add(number)
                if (it.size < bestCombination?.size ?: it.size + 1) {

                    // MUST DE-REFERENCE THE LIST
                    bestCombination = it.toMutableList()
                }
            }
        }
        memory[targetSum] = bestCombination
        return bestCombination
    }
}