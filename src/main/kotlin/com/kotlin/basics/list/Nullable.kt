package com.kotlin.basics.list

fun main() {
    val nullableList : List<Int?> = listOf(1,2,null,4,5,null)
    nullableList.forEach { e-> println(e?.toString() ?: "the element is null") }
    val nonNullableList = nullableList.filterNotNull()
    nonNullableList.forEach { e -> println(e) }

}