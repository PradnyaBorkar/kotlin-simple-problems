package com.kotlin.basics.list

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SimpleListTest{

    fun <T> last(list : List<T>) = list.last()

    fun <T> secondLast(list : List<T>) = list.dropLast(1).last()

    fun <T> findNthElement(list : List<T>, position : Int) = list[position]

    @Test
    fun `find the last element of the list`(){
        assert(last(listOf(1,2,3,4,5,6,7)) == 7)
    }

    @Test
    fun `find the last element of the string list`(){
        assert(last(listOf("a","b","c")) == "c")
    }

    @Test
    fun `find second last element of the list`() {
        assert(secondLast(listOf(1,2,3,4)) == 3)
    }

    @Test
    fun `should return nth element from the list`(){
     assert(findNthElement(listOf(1,2,3,4),0) == 1)
    }

    @Test
    fun `should throw exception when position is out of bound`(){
        assertThrows<ArrayIndexOutOfBoundsException> {(findNthElement(listOf(1,2,3,4),-1))}
    }
}