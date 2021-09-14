package com.william.controller;

import com.william.model.Department;
import com.william.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsersController {
    ArrayList<User> Users = new ArrayList<User>();


    @GetMapping("/Users")
    public ArrayList<User> getUsers() {
        return Users;
    }

    @PostMapping("/Users")
    public ArrayList <User> addUsers (int id, String code, String firstName, String lastName, String function, String email, String phone, Department department){
        Users.add(new User(id,code,firstName,lastName,function,email,phone,department));
                return Users;
    }

}
