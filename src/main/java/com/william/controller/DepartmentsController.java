package com.william.controller;

import com.william.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartmentsController {
    ArrayList<Department> Departments = new ArrayList<Department>();

    @GetMapping("/Department")
    public ArrayList<Department> getDepartments() {
        return Departments;
    }

    @PostMapping("/Department")
    public ArrayList<Department> addDepartment(int id, String code, String name) {
        Departments.add(new Department(id, code,name));
        return Departments;
    }
}
