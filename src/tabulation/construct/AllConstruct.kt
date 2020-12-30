package tabulation.construct

object AllConstruct {
    fun getAllCombinations(targetWord: String, wordBank: Array<String>):
            MutableList<MutableList<String>> {
        val table = Array<MutableList<MutableList<String>>>(targetWord.length + 1) {
            mutableListOf()
        }
        table[0] = mutableListOf(mutableListOf())
        for (i in 0..targetWord.length) {
            if (table[i].isNotEmpty()) {
                for (word in wordBank) {
                    try {
                        if (word == targetWord.slice(i until (i + word.length))) {
                            //----------------- Double De-Referencing ---------------//
                            val combinations = table[i].toMutableList()
                            combinations.map {
                                val combination = it.toMutableList() // MUST DO
                                combination.add(word)
                                table[i + word.length].add(combination)
                            }
                        }
                    } catch (e: StringIndexOutOfBoundsException) {
                    }
                }
            }
        }
        return table[targetWord.length]
    }
}