package com.example.demo;

public class Products {
    private String id;
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
