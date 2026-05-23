package com.jsank.corejavapractice.DesignPatterns.FactoryPattern;

public class Tester implements Employee {
    @Override
    public int getSalary() {
        System.out.println(" Tester ");
        return 300;
    }
}
