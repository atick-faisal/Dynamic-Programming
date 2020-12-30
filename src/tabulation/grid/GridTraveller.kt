package tabulation.grid

object GridTraveller {
    fun getNumberOfPaths(m: Int, n: Int): Long {
        val grid = Array(m + 1) { Array(n + 1) { 0L } }
        grid[1][1] = 1
        for (i in 0..m) {
            for (j in 0..n) {
                if ((i + 1) <= m) grid[i + 1][j] += grid[i][j]
                if ((j + 1) <= n) grid[i][j + 1] += grid[i][j]
            }
        }
        return grid[m][n]
    }
}