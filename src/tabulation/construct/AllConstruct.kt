package tabulation.construct
//
//object AllConstruct {
//    fun getAllCombinations(targetWord: String, wordBank: Array<String>):
//            MutableList<MutableList<String>> {
//        val table = Array<MutableList<String>?>(targetWord.length + 1) { null }
//        table[0] = mutableListOf()
//        val combinations = mutableListOf<MutableList<String>>()
//        for (i in 0..targetWord.length) {
//            if (table[i] != null) {
//                for (word in wordBank) {
//                    try {
//                        if (word == targetWord.slice(i until (i + word.length))) {
//                            table[i + word.length] = table[i]!!.toMutableList()
//                            table[i + word.length]!!.add(word)
//                        }
//                    } catch (e: StringIndexOutOfBoundsException) {
//                    }
//                }
//            }
//        }
//        return table[targetWord.length]
//    }
//}