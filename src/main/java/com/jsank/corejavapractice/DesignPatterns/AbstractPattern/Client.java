package com.jsank.corejavapractice.DesignPatterns.AbstractPattern;

public class Client {
    public static void main(String[] args) {

        // I want android developer

       Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory(), "Android");


        System.out.println(" name :- " +  e1.name() + " salary :- " + e1.salary());

         // I want web developer

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory(), "Web");

        System.out.println(" name :- " +  e2.name() + " salary :- " + e2.salary());
    }
}
