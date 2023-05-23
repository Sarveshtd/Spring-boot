package com.example.demo.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //we r going to save this as sql table so using entity
public class Products {

    @Id 
    private String id; // here id is primary key
    private String name;
    private String describe;
    
    public Products(String id, String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public Products() {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
