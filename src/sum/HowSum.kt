package sum

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
}