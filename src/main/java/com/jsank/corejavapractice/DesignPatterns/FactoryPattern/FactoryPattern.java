package com.jsank.corejavapractice.DesignPatterns.FactoryPattern;

public class FactoryPattern {

    public static void main(String[] args) {
        EmployeeFactory employee = new EmployeeFactory();
        Employee developer = employee.getEmployee("DEVELOPER");
        Employee tester = employee.getEmployee("TESTER");

        System.out.println(tester.getSalary());
        System.out.println(developer.getSalary());

    }
}
