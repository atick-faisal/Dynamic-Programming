package recursion.construct

object CanConstruct {
    fun isConstructable(targetWord: String, wordBank: Array<String>): Boolean {
        if (targetWord.isEmpty()) return true
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                if (isConstructable(suffix, wordBank)) {
                    return true
                }
            }
        }
        return false
    }

    fun isConstructableOptimized(
            targetWord: String,
            wordBank: Array<String>,
            memory: HashMap<String, Boolean> = hashMapOf()
    ): Boolean {
        if (memory.containsKey(targetWord)) return memory[targetWord]!!
        if (targetWord.isEmpty()) return true
        for (word in wordBank) {
            if (targetWord.startsWith(word)) {
                val suffix = targetWord.slice(word.length until targetWord.length)
                if (isConstructableOptimized(suffix, wordBank, memory)) {
                    memory[targetWord] = true
                    return true
                }
            }
        }
        memory[targetWord] = false
        return false
    }
}