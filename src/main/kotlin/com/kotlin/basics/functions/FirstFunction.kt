package com.kotlin.basics.functions

fun multipleParameters(arg1 : Int, arg2 : String = "abc", arg3 : Boolean = true, arg4 : String){
    println("$arg1 $arg2 $arg3 $arg4")
}

fun main() {
    multipleParameters(2, "b", false, "c")
    multipleParameters(arg1 = 1, arg4 = "b")
}