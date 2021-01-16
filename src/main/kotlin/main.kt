fun main() {
    val shopping= mutableListOf("Tea","Eggs","Milk")
    if(shopping.size>0) {
        println(shopping.get(2))
    }
    for(item in shopping) println(item)
    if(shopping.contains("Eggs")) {
        println(shopping.indexOf("Milk"))
    }
    //println(shopping[0])
    if(shopping.contains("Milk")) {
        shopping.remove("Milk")
        shopping.removeAt(1)
    }
    shopping[0]="Tea"
    for(item in shopping) println(item)
}