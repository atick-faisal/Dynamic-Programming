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
}