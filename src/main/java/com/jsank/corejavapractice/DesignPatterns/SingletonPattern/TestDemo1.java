package com.jsank.corejavapractice.DesignPatterns.SingletonPattern;

public class TestDemo1 {

    private static TestDemo1 INSTANCE;

    private TestDemo1(){
        System.out.println("Test Demo constructor called ");
    }

    //Lazy way of creating object
    public static TestDemo1 getInstance(){
        if (INSTANCE == null){
            INSTANCE =  new TestDemo1();
        }
        return INSTANCE;
    };
}
