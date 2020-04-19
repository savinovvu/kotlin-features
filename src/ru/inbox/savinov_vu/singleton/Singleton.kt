package ru.inbox.savinov_vu.singleton


object Singleton{
    private var count = 0
    fun doSomething():Unit {
        println("Calling a doSomething ${++count} call/-s in")
    }
}