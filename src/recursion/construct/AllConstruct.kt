package recursion.construct

object AllConstruct {
    fun getAllCombinations(targetWord: String, wordBank: Array<String>):
            MutableList<MutableList<String>> {
        if (targetWord.isEmpty()) return mutableListOf(mutableListOf())
        val result = mutableListOf<MutableList<String>>()
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                val ways = getAllCombinations(suffix, wordBank)
                ways.map { way ->
                    way.add(word)
                    result.add(way)
                }
            }
        }
        return result
    }

    fun getAllCombinationsOptimized(
            targetWord: String,
            wordBank: Array<String>,
            memory: HashMap<String, MutableList<MutableList<String>>> = hashMapOf()
    ): MutableList<MutableList<String>> {
        if (memory.containsKey(targetWord)) return memory[targetWord]!!
        if (targetWord.isEmpty()) return mutableListOf(mutableListOf())
        val result = mutableListOf<MutableList<String>>()
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                val ways = getAllCombinationsOptimized(suffix, wordBank, memory)
                ways.map { way ->
                    way.add(word)
                    result.add(way)
                }
            }
        }
        memory[targetWord] = result
        return result
    }
}