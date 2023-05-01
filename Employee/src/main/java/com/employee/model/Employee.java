package com.employee.model;

public class Employee {

    public int id;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String name;
    public String email;
}
