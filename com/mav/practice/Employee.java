package com.mav.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {

    private Integer id;
    private String name;
    public Employee(Integer id, String name) {
        super();
        this.id= id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Map<Employee,String>map=new HashMap<>();
        Employee e=new Employee(1,"Ram");
        map.put(e,"Developer");
        e.setName("Sham");
        System.out.println(map.get(e));
    }
}
