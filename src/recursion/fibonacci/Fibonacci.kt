package recursion.fibonacci

object Fibonacci {
    fun getAtPosition(n: Int): Int {
        if (n <= 2) return 1
        return getAtPosition(n - 1) + getAtPosition(n - 2)
    }

    fun getAtPositionOptimized(n: Int, memory: HashMap<Int, Long> = hashMapOf())
            : Long {
        if (memory.containsKey(n)) return memory[n]!!
        if (n <= 2) return 1
        memory[n] = getAtPositionOptimized(n - 1, memory) +
                getAtPositionOptimized(n - 2, memory)
        return memory[n]!!
    }
}