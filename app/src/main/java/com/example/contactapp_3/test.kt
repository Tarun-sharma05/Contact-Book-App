package com.example.contactapp_3

fun main() {
     val Test = "Tarun Sharma"
    val test1 =Test.split(" ", ignoreCase = false)
        test1.forEach{
         print(it.first())
    }
}