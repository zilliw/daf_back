package com.william.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
    @Id @GeneratedValue
    private int id;
    private String code;
    private String name;

    public Department (int id,String code,String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
        public int getId() {
        return this.id;
    }
        public String getCode() {return this.code; }
        public String getName() {return this.name; }

        public void setId(int id) {
        this.id = id;
    }
        public void setCode(String code) {
        this.code = code;
    }
        public void setName(String childCode) {
        this.name = name;
    }

}
