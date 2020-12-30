package recursion.sum

object HowSum {
    fun getElements(targetSum: Int, numbers: Array<Int>)
            : MutableList<Int>? {
        if (targetSum == 0) return mutableListOf()
        if (targetSum < 0) return null
        for (number in numbers) {
            val newTarget = targetSum - number
            val result = getElements(newTarget, numbers)
            result?.let {
                it.add(number)
                return it
            }
        }
        return null
    }

    fun getElementsOptimized(
            targetSum: Int,
            numbers: Array<Int>,
            memory: HashMap<Int, MutableList<Int>?> = hashMapOf()
    ): MutableList<Int>? {
        if (memory.containsKey(targetSum)) return memory[targetSum]
        if (targetSum == 0) return mutableListOf()
        if (targetSum < 0) return null
        for (number in numbers) {
            val newTarget = targetSum - number
            val result = getElementsOptimized(newTarget, numbers, memory)
            result?.let {
                it.add(number)
                memory[targetSum] = it
                return it
            }
        }
        memory[targetSum] = null
        return null
    }
}