package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee(String type) {

        return new AndroidDeveloper();
    }
}
