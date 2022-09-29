package com.location.java.design.zerenlian.sample

import design.zerenlian.Client
import design.zerenlian.Request

fun main() {
    val client = Client()
    client.addHandler(AHandler())
    client.addHandler(BHandler())
    client.addHandler(CHandler())
    val request = Request("apple",266)
    val handlerEvent = client.getHandlerEvent(request)
    handlerEvent?.let {
        println("response=$it")
    }

}