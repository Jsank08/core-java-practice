package com.jsank.corejavapractice.DesignPatterns.FactoryPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String type){

        if (type.trim().equalsIgnoreCase("DEVELOPER")){
            return new Developer();
        } else if (type.trim().equalsIgnoreCase("TESTER")) {
            return new Tester();
        } else {
            return new ProjectManager();
        }
    }
}
