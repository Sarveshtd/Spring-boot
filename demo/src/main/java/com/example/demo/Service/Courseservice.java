package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Class.Course;
import com.example.demo.Repository.CourseRepository;
//import com.example.demo.Repository.ProductRepository;

@Service
public class Courseservice {

    @Autowired
    private CourseRepository courseRepository;
    //private String productId;
    
    public List<Course> dis(String productId){ //dis() is same as Productcontroller class 
        List<Course> courses = new ArrayList<>();
        courseRepository.findByProductId(productId ).forEach(courses :: add);
        return courses;
    }

    public Course getCourse(String id){
        //return product.stream().filter(t -> t.getId().equals(id)).findFirst().get(); // we use lambda fn.
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourses(Course course){
          courseRepository.save(course);
        
    }

    public void updatecourses(Course course) {
        courseRepository.save(course);
    }

    public void deletecourses( String id) { //@PathVariable for nested url.
        courseRepository.deleteById(id);
    }
}
