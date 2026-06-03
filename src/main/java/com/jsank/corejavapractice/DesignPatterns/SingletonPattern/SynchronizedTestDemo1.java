package com.jsank.corejavapractice.DesignPatterns.SingletonPattern;

public class SynchronizedTestDemo1 {

   //eager way of creating object
    private static SynchronizedTestDemo1 synchronizedTestDemo1 = new SynchronizedTestDemo1();

    // 1. Volatile variable ensures changes are instantly visible to all threads
    private static SynchronizedTestDemo1 synchronizedTestDemoInstance;


    // 2. Private constructor prevents object instantiation from outside the class
    private SynchronizedTestDemo1(){

    }

    // 3. Public global access point to retrieve the single instance
    public static SynchronizedTestDemo1 getInstance(){
        // First check: skip synchronization block if instance is already created
        if (synchronizedTestDemoInstance == null){
            synchronized (SynchronizedTestDemo1.class){
                synchronizedTestDemoInstance = new SynchronizedTestDemo1();
                System.out.println(" synchronized object created");
            }
        }
        return synchronizedTestDemoInstance;
    }
}
