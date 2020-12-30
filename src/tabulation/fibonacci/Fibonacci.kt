package tabulation.fibonacci

object Fibonacci {
    fun getAtPosition(n: Int): Long {
        val table = Array(n + 1) {0L}
        table[1] = 1L
        for (i in 0..n) {
            if ((i + 2) <= n) table[i + 2] += table[i]
            if ((i + 1) <= n) table[i + 1] += table[i]
        }
        return table[n]
    }
}