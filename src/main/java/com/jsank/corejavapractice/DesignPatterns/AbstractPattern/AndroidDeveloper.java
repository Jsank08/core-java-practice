package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        System.out.println(" I am an Android Developer");
        return "Android Developer";
    }
}
