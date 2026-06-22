package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee(String type) {
       return new WebDeveloper();
    }
}
