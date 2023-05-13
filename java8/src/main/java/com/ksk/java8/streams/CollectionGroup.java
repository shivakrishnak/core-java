package com.ksk.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionGroup {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("AAA", "US", 25000),
                new Employee("BBB", "India", 100000),
                new Employee("CCC", "India",50000)
        );
        Map<String, Optional<Employee>> result = highestSalaryByLocation(employees);
        System.out.println(result);
    }

    private static Map<String, Optional<Employee>> highestSalaryByLocation(List<Employee> employees) {
        return employees.stream().
                collect(Collectors.groupingBy(Employee::getLocation,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        //return employees.stream().collect(Collectors.maxBy((x,y) -> y.getSalary() - x.getSalary()),Collectors.groupingBy(Employee::getLocation)));
    }

}

class Employee{
    private String name;
    private String location;
    private int salary;

    public Employee(String name, String location, int salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
