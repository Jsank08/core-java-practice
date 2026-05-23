package com.jsank.corejavapractice.DesignPatterns.SingletonPattern;

public class SingletonDemo {

    public static void main(String[] args) {
//        TestDemo1 testDemo1 =  TestDemo1.getInstance();
//        TestDemo1 testDemo2 =  TestDemo1.getInstance();
//
//        System.out.println(testDemo1.hashCode());
//        System.out.println(testDemo2.hashCode());

        SynchronizedTestDemo1 synchronizedTestDemo1 = SynchronizedTestDemo1.getInstance();
        SynchronizedTestDemo1 synchronizedTestDemo2 = SynchronizedTestDemo1.getInstance();

        System.out.println(synchronizedTestDemo1.hashCode());
        System.out.println(synchronizedTestDemo2.hashCode());


    }
}
