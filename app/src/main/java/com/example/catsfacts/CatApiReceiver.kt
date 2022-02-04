package com.example.catsfacts

import java.net.URL

fun main() {
    val catFactsContent = URL("https://cat-fact.herokuapp.com/facts").readText()
    print(catFactsContent)
}