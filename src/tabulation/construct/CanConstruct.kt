package tabulation.construct

import java.lang.Exception

object CanConstruct {
    fun isPossible(targetWord: String, wordBank: Array<String>): Boolean {
        val table = Array(targetWord.length + 1) { false }
        table[0] = true
        for (i in 0..targetWord.length) {
            if (table[i]) {
                for (word in wordBank) {
                    try {
                        if (word == targetWord.slice(i until (i + word.length))) {
                            table[i + word.length] = true
                        }
                    } catch (e: StringIndexOutOfBoundsException) {
                    }
                }
            }
        }
        return table[targetWord.length]
    }
}