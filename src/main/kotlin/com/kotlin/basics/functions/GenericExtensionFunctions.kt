package com.kotlin.basics.functions

fun <T> List<T>.printEach(){
    this.forEach { e -> println(e) }
}

fun main() {
    mutableListOf(1,2,3).printEach()
    listOf("1","2","3").printEach()
    val str : String? = null
    str?.length
    print(str.toUppercase())



}

fun String?.toUppercase() : String? {
  return this?.toUpperCase() ?: this
}