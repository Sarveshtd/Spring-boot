//repository is used to connect db

package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Class.Course;

public interface CourseRepository extends CrudRepository<Course, String> { //CrudRepository  is also an interface
    
    
    public List<Course> findByProductId(String productId); //ProductsId means Product class acts as an argument in Course class so added like this
}
