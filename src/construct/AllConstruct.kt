package construct

object AllConstruct {
    fun getAllWays(targetWord: String, wordBank: Array<String>):
            MutableList<MutableList<String>> {
        if (targetWord.isEmpty()) return mutableListOf(mutableListOf())
        val result = mutableListOf<MutableList<String>>()
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                val ways = getAllWays(suffix, wordBank)
                ways.map { way ->
                    way.add(word)
                    result.add(way)
                }
            }
        }
        return result
    }
}