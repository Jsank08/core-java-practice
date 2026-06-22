package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory, String type) {
        return factory.createEmployee(type);

    }
}
