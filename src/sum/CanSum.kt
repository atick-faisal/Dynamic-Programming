package sum

object CanSum {
    fun isPossible(targetSum: Int, numbers: Array<Int>): Boolean {
        if (targetSum == 0) return true
        if (targetSum < 0) return false
        for (number in numbers) {
            val newTarget = targetSum - number
            if (isPossible(newTarget, numbers)) {
                return true
            }
        }
        return false
    }

    fun isPossibleOptimized(
            targetSum: Int,
            numbers: Array<Int>,
            memory: HashMap<Int, Boolean> = hashMapOf()
    ): Boolean {
        if (memory.containsKey(targetSum)) return memory[targetSum]!!
        if (targetSum == 0) return true
        if (targetSum < 0) return false
        for (number in numbers) {
            val newTarget = targetSum - number
            if (isPossibleOptimized(newTarget, numbers, memory)) {
                memory[targetSum] = true
                return true
            }
        }
        memory[targetSum] = false
        return false
    }
}