package recursion.grid

object GridTraveller {
    fun getNumberOfPaths(m: Int, n: Int): Long {
        if (m == 1 && n == 1) return 1
        if (m == 0 || n == 0) return 0
        return getNumberOfPaths(m - 1, n) + getNumberOfPaths(m, n - 1)
    }

    fun getOptimizedNumberOfPaths(m: Int, n: Int, memory: HashMap<String, Long> = hashMapOf())
            : Long {
        val key = "$m,$n"
        if (memory.containsKey(key)) return memory[key]!!
        if (m == 1 && n == 1) return 1
        if (m == 0 || n == 0) return 0
        memory[key] = getOptimizedNumberOfPaths(m - 1, n, memory) +
                getOptimizedNumberOfPaths(m, n - 1, memory)
        return memory[key]!!
    }

    fun getMoreOptimizedNumberOfPaths(m: Int, n: Int, memory: HashMap<String, Long> = hashMapOf())
            : Long {
        val key1 = "$m,$n"
        val key2 = "$n,$m"
        if (memory.containsKey(key1) || memory.containsKey(key2)) return memory[key1]!!
        if (m == 1 && n == 1) return 1
        if (m == 0 || n == 0) return 0
        memory[key1] = getMoreOptimizedNumberOfPaths(m - 1, n, memory) +
                getOptimizedNumberOfPaths(m, n - 1, memory)
        memory[key2] = getOptimizedNumberOfPaths(m - 1, n, memory) +
                getMoreOptimizedNumberOfPaths(m, n - 1, memory)
        return memory[key1]!!
    }
}