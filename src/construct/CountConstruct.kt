package construct

object CountConstruct {
    fun getCount(targetWord: String, wordBank: Array<String>): Int {
        if (targetWord.isEmpty()) return 1
        var count = 0
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                count += getCount(suffix, wordBank)

            }
        }
        return count
    }

    fun getCountOptimized(
            targetWord: String,
            wordBank: Array<String>,
            memory: HashMap<String, Int> = hashMapOf()
    ): Int {
        if (memory.containsKey(targetWord)) return memory[targetWord]!!
        if (targetWord.isEmpty()) return 1
        var count = 0
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                count += getCountOptimized(suffix, wordBank, memory)

            }
        }
        memory[targetWord] = count
        return count
    }
}