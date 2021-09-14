package com.william.model;

public class User {
    private int id;
    private String code;
    private String firstName;
    private String lastName;
    private String function;
    private String email;
    private String phone;

    private Department department;

    public User (int id,String code,String firstName,String lastName,String function,String email,String phone, Department department) {
        this.id = id;
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }
    public int getId() {
        return this.id;
    }
    public String getCode() {
        return this.code;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFunction() {
        return this.function;
    }
    public String getEmail() { return this.email; }
    public String getPhone() { return this.phone; }
    public Department getDepartment() {
        return this.department;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setFirstName(String childCode) {
        this.firstName = firstName;
    }
    public void setLastName(String client) {
        this.lastName = lastName;
    }
    public void setFunction(String name) {
        this.function = function;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
