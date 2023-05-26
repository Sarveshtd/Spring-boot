package com.example.demo.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity //we r going to save this as sql table so using entity
public class Course {

    @Id 
    private String id; // here id is foreign key
    private String name;
    private String describe;

    @ManyToOne //All the couses r come to one topic 
    private Products product;

        
    public Course(String id, String name, String describe , String productId) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.product=new Products(productId, "", "");
    }

    public Course() {

    }

    public Products getProduct() {
        return this.product;
    }

    public void setProduct(Products product) {
        this.product = product;
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
