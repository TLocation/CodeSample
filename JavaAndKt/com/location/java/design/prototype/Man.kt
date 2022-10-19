package com.location.java.design.prototype

class Man:Product {
    override fun use(s: String) {
        println("Man:$s")
    }

    override fun createClone(): Product {
        return Man()
    }
}