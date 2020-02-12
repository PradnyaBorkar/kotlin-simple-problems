package com.kotlin.basics.functions

class ExtensionFunctions {
    fun printName(){
        print("I am a member function")
    }
}

fun ExtensionFunctions.printName(){
    print("I am extension function")
}

fun main() {
    ExtensionFunctions().printName()
}
