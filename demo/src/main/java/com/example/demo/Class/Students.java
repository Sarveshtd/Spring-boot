package com.example.demo.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Students {
    
    private String names;

    @Id
    private String id;
    private String email;
    private String phno;

    

    public Students(String names,String id, String email, String phno) {
        this.names = names;
        this.id=id;
        this.email = email;
        this.phno = phno;
    }

    public Students() {
    }

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return this.phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
