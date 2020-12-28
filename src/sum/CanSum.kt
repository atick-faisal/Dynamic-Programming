package sum

object CanSum {
    fun isPossible(targetSum: Int, numbers: Array<Int>): Boolean {
        if (targetSum == 0) return true
        if (targetSum < 0) return false
        for (number in numbers) {
            val newTarget = targetSum - number
            return isPossible(newTarget, numbers)
        }
        return false
    }
}