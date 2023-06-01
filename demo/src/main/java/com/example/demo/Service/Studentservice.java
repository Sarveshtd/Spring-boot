package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Class.Students;
import com.example.demo.Repository.StudentRepository;

@Service
public class Studentservice {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> show() {
        List <Students> students =new ArrayList<>();
        studentRepository.findAll().forEach( students :: add);
        return students;
    }

    public Students getStudents(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Students newstudents(Students students) {
        return studentRepository.save(students);
    }

    public Students updatestudents(Students students, String id) {
        return studentRepository.save(students);
    }

   
    public void deletestudents(String id) {
         studentRepository.deleteById(id);
    }

     
    
}
