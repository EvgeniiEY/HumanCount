package ru.netology

fun main() {
    val likes: Int = 61


    val oneHuman: String = "человеку"
    val people: String = "людям"



    if (likes % 10 == 1 && likes != 11 && likes != 111 && likes != 1111 && likes != 1211) {
        println("Понравилось $likes $oneHuman")
    } else if (likes == 1) {
        println("Понравилось $likes $oneHuman")
    } else {
        println("Понравилось $likes $people")
    }
}