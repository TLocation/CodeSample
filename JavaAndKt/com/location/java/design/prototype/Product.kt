package com.location.java.design.prototype

interface Product {
    fun use(s: String)

    fun createClone(): Product
}