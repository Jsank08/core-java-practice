package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println(" I am a Web Developer");
        return "Web Developer";
    }
}
