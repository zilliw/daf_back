package com.william.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Toto {
    @Id @GeneratedValue
    private Integer id;
    private Integer code;
    private String name;


    public Toto() {}

    public Toto(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    public Integer getCode() {return this.code; }
    public String getName() {
        return this.name;
    }


    public void setId(Integer id) {
        this.id = id;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
}
