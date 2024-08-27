package com.mav.interview;

public class Employee {

    private String name ;

    private long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
