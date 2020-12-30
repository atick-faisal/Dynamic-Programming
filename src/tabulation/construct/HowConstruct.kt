package tabulation.construct

object HowConstruct {
    fun getCombination(targetWord: String, wordBank: Array<String>): MutableList<String>? {
        val table = Array<MutableList<String>?>(targetWord.length + 1) { null }
        table[0] = mutableListOf()
        for (i in 0..targetWord.length) {
            if (table[i] != null) {
                for (word in wordBank) {
                    try {
                        if (word == targetWord.slice(i until (i + word.length))) {
                            table[i + word.length] = table[i]!!.toMutableList()
                            table[i + word.length]!!.add(word)
                        }
                    } catch (e: StringIndexOutOfBoundsException) {
                    }
                }
            }
        }
        return table[targetWord.length]
    }
}