package com.location.java.thread;

public class VolatileTest {




    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        test.test();
    }

    private /* volatile */ int value = 0;

    private void test() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    value++;
                    if(value > 10){
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("value=" + value);
                }
            }
        });
        thread.start();
        while (value < 3){
            System.out.println("value=" + value);
        }
        System.out.println("end");
    }
}
