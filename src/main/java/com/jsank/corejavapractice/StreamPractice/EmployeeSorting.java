package com.jsank.corejavapractice.StreamPractice;

import com.jsank.corejavapractice.DesignPatterns.FactoryPattern.Employee;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Getter
@Setter
class Employees {
    int id;
    String name;
    String department;
    int age;
    double salary;

    public Employees(int id, String name, String department, int age, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString(){
        return "{ " + "id : " + id + ", name : " + name + ", salary : " + salary + ", dept : " + department + " }" ;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {

        List<Employees> employeeList = Arrays.asList(
                new Employees(101, "Sushil", "Engineering", 24, 45000),
                new Employees(102, "Sunile", "HR", 28, 55000),
                new Employees(103, "Mahesh", "Finance", 32,85000),
                new Employees(104, "Suraj", "Engineering", 21,48000),
                new Employees(105, "Amol", "HR", 29,53000)
        );

        List<Employees> sortedSalary = employeeList.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).toList();
//        sortedSalary.forEach(emp -> System.out.println(emp.salary));
//        System.out.println(sortedSalary);

        OptionalDouble avg = employeeList.stream().mapToInt(Employees::getAge).average();

//        System.out.println(avg);

          sortedSalary.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));

          sortedSalary.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.maxBy(Comparator.comparing(Employees::getSalary))));

          Set<String> freq = sortedSalary.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()))
                  .entrySet().stream().filter(enty -> enty.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toSet());

        System.out.println(freq);

        sortedSalary.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.groupingBy(emp -> emp.getSalary() > 80000)));

        sortedSalary.stream().collect(Collectors.groupingBy(employees -> employees.getDepartment()));

    }
}
