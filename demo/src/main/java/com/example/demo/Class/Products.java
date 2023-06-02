package com.example.demo.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //we r going to save this as sql table so using entity
@Table
public class Products {

    @Id 
    private String id; // here id is primary key
    private String name;
    private String describe;

    @ManyToOne
    private Students students;

    
    public Products(String id, String name, String describe ,String studentId) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.students= new Students("", studentId, "", "");
    }

    public Products() {

    }
    public Students getStudents() {
        return this.students;
    }

    public void setStudents(Students students) {
        this.students = students;
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
