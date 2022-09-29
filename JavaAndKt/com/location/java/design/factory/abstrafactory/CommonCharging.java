package com.location.java.design.factory.abstrafactory;

public class CommonCharging  implements  Charging{

    @Override
    public void charg() {
        System.out.println("开始充电");
    }
}
