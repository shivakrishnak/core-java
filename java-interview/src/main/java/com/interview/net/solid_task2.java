// This code snippet violates multiple SOLID principles. Your task is to identify and explain the violations.

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public double calculateBonus() {
        if (age > 30 && salary > 5000) {
            return salary * 0.2;
        } else {
            return 0;
        }
    }
}

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public void printAllEmployeeDetails() {
        for (Employee employee : employees) {
            employee.printEmployeeDetails();
        }
    }

    public void calculateAndPrintBonuses() {
        for (Employee employee : employees) {
            double bonus = employee.calculateBonus();
            System.out.println("Bonus for " + employee.getName() + ": " + bonus);
        }
    }
}

// Your task is to:
// 1. Identify the violations of SOLID principles in the code. Which exactly principles are violated and how?
// 2. Explain each violation and how it can be improved to adhere to SOLID principles.