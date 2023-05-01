package com.employee.controller;

import com.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private final List<Employee> employees =
            List.of(new Employee(1, "Aman", "aman@gmail.com"),
                    new Employee(2, "deq", "deq@gmail.com"));

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employees.stream().filter(employee -> employee.id == id).findFirst().orElse(null);
    }
}
