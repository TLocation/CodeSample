package com.location.java.design.zerenlian.sample

import design.zerenlian.Handler
import design.zerenlian.Request
import design.zerenlian.Response

class CHandler: Handler() {
    override fun handlerEvent(request: Request): Response? {
        println("Test Handler ${hashCode()}")
        if(request.code <300){
            return Response("params=[${request.params}] ${javaClass.simpleName} 已经处理")
        }else{
            request.params+="|${javaClass.simpleName}"
        }
        return next?.handlerEvent(request)
    }
}