package com.vikash.basics
import java.util.Date
import java.util.ArrayList
import java.util.Stack
fun greet(){
  println("Hello from com.vikash.basics package!")
}
fun main() {
    greet()
    go()
}
fun go(){
    val today = Date()
    val list = ArrayList<String>()
    list.add("Kotlin")
    list.add("Vikash")
    list.add("Aasis Kumar")
    
    println(today)
    println("List : $list")
    go1()
}
fun go1(){
  val stack = Stack<Int>()
  
  stack.push(20)
  stack.push(30)
  stack.push(40)
  
  stack.push(50)
  stack.push(60)
  stack.push(70)
  
  println("Stack top: ${stack.peek()}")
  println("Popped: ${stack.pop()}")
  println("Stack now: $stack")
}

