


fun countFrequechyOfChars(list:MutableList<Char>){
    val frequency : MutableMap<Char, Int> = HashMap()
    for (char in list){
        var count = frequency[char]
        if (count == null) count = 0
        frequency[char] = count+1
    }
    frequency.toSortedMap()
    for (i in frequency){  print(" ${i.key} : ${i.value}") }
}

fun removeDuplicatesFromList(list:MutableList<Char>): List<Char>{
    list.sortDescending()
    val distinctList = list.distinct()
    return distinctList
    }

