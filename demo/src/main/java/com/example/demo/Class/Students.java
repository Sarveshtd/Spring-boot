package com.example.demo.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Students {
    
    private String names;

    @Id
    private String studentid;
    private String email;
    private String phno;

    

    public Students(String names,String studentid, String email, String i) {
        this.names = names;
        this.studentid=studentid;
        this.email = email;
        this.phno = i;
    }

    public Students() {
    }

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    
    public String getStudentid() {
        return this.studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
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
