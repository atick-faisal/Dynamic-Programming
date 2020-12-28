package construct

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
}