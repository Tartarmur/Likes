package ru.netology

fun main() {
    val likes = "13101"
    val countLikes = likes.toInt()
    val count = 11
    val dangerousLastChar = '1'

    if (likes.length === 1 && likes[likes.length - 1] !== dangerousLastChar) {
        println("Понравилось " + likes + " людям")
    } else if (likes.length >= 2 && likes[likes.length - 1] !== dangerousLastChar && countLikes !== count) {
        println("Понравилось " + likes + " людям")
    } else if (likes.length >= 2 && likes[likes.length - 1] === dangerousLastChar && likes[likes.length - 2] === dangerousLastChar) {
        println("Понравилось " + likes + " людям")
    } else {
        println("Понравилось " + likes + " человеку")
    }
}