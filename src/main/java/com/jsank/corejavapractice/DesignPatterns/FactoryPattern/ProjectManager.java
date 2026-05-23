package com.jsank.corejavapractice.DesignPatterns.FactoryPattern;

public class ProjectManager implements Employee {
    @Override
    public int getSalary() {
        System.out.println(" Project Manager ");
        return 500;
    }
}
