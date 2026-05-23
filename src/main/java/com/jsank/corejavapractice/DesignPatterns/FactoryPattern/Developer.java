package com.jsank.corejavapractice.DesignPatterns.FactoryPattern;

public class Developer implements Employee {
    @Override
    public int getSalary() {
        System.out.println(" Software Developer ");
        return 400;
    }
}
