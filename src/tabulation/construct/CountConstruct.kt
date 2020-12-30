package tabulation.construct

object CountConstruct {
    fun getCount(targetWord: String, wordBank: Array<String>): Long {
        val table = Array(targetWord.length + 1) { 0L }
        table[0] = 1L
        for (i in 0..targetWord.length) {
            if (table[i] != 0L) {
                for (word in wordBank) {
                    try {
                        if (word == targetWord.slice(i until (i + word.length))) {
                            table[i + word.length] += table[i]
                        }
                    } catch (e: StringIndexOutOfBoundsException) {
                    }
                }
            }
        }
        return table[targetWord.length]
    }
}