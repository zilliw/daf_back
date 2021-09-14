package com.william.model;


public class Opportunity {
    private int id;
    private String code;
    private String childCode;
    private String client;
    private String name;
    private String user;

    private Department department;
    private Delivery delivery;
    private Status status;

    public Opportunity(int id, String code, String childCode, String client, String name, Department department, String user, Delivery delivery, Status status ) {
        this.id = id;
        this.code = code;
        this.childCode = childCode;
        this.client = client;
        this.name = name;
        this.department = department;
        this.user = user;
        this.delivery = delivery;
        this.status = status;
    }
            public int getId() {
                return this.id;
            }
            public String getCode() {
                return this.code;
            }
            public String getChildCode() {
                return this.childCode;
            }
            public String getName() {
                return this.name;
            }
            public String getClient() {
                return this.client;
            }
            public Department getDepartment() {
                return this.department;
            }
            public String getUser() {
                return this.user;
            }
            public Delivery getDelivery() {
                return this.delivery;
            }
            public Status getStatus() {
                return this.status;
            }

            public void setId(int id) {
                this.id = id;
            }
            public void setCode(String code) {
                this.code = code;
            }
            public void setChildCode(String childCode) {
                this.childCode = childCode;
            }
            public void setClient(String client) {
                this.client = client;
            }
            public void setName(String name) {
                this.name = name;
            }
            public void setDepartment(Department department) {
                this.department = department;
            }
            public void setUser(String user) {
                this.user = user;
            }
            public void setDelivery(Delivery delivery) {
                this.delivery = delivery;
            }
            public void setStatus(Status status) {
                this.status = status;
            }

}
