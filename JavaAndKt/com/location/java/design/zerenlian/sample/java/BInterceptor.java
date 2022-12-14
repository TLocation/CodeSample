package com.location.java.design.zerenlian.sample.java;

import design.zerenlian.Request;
import design.zerenlian.Response;

public class BInterceptor implements Interceptor{

    @Override
    public Response intercept(Chain chain) {
        Request request = chain.getRequest();
        if(request.getCode() < 200){
            return new Response(request.getParams() + " " +getClass().getSimpleName()+" 已经处理");
        }else {
            request.setParams(request.getParams()+"| 经过"+getClass().getSimpleName());
        }
        return chain.proceed(request);
    }
}
