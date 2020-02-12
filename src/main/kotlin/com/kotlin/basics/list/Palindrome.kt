package com.kotlin.basics.list



fun main() {
    val s = "abcbad"
    s.length
    var counter = s.length
    var isPalindrome = true
    for (a in s){
        if(a == s[counter-1]) {
            counter --
            continue
        }
        else {
            isPalindrome = false
            break
        }


    }
    print(isPalindrome)

}