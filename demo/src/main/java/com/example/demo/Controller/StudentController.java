package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Class.Students;
import com.example.demo.Service.Studentservice;

@RestController
public class StudentController {

    @Autowired
    private Studentservice studentservice;

    @RequestMapping("/Students")
    public List <Students> show(){
        return studentservice.show();
    }

    @RequestMapping("/Students/{id}")
    public Students getStudents(@PathVariable String id){
        return studentservice.getStudents(id);
    }

    @RequestMapping(value = "/Students" , method = RequestMethod.POST)
    public void newstudents(@RequestBody Students students){
         studentservice.newstudents(students);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Students/{id}")
    public void updatestudents(@RequestBody Students students, @PathVariable String id){
         studentservice.updatestudents(students, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Students/{id}")
    public void deletestudents(@PathVariable String id){
         studentservice.deletestudents(id);
    }


    

    
}
