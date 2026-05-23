package com.jsank.corejavapractice.DesignPatterns.SingletonPattern;

public class SynchronizedTestDemo1 {

//    //eager way of creating object
//    private static SynchronizedTestDemo1 synchronizedTestDemo1 = new SynchronizedTestDemo1();

    private static SynchronizedTestDemo1 synchronizedTestDemoInstance;

    private SynchronizedTestDemo1(){

    }

    public static SynchronizedTestDemo1 getInstance(){
        if (synchronizedTestDemoInstance == null){
            synchronized (SynchronizedTestDemo1.class){
                synchronizedTestDemoInstance = new SynchronizedTestDemo1();
                System.out.println(" synchronized object created");
            }
        }
        return synchronizedTestDemoInstance;
    }
}
