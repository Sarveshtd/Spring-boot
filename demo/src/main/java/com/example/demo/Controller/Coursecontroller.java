package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Class.Course;
import com.example.demo.Class.Products;
import com.example.demo.Service.Courseservice;

//When the class is declared for controller must use @RestController
@RestController
public class Coursecontroller {
    //Products products=new Products();

    @Autowired
    private Courseservice courseservice;

    //@RequestMapping is used for get method
    @RequestMapping("/Students/{studentId}/products/{id}/courses")
    public List<Course> dis(@PathVariable String id  ) { //<Products> denotes Products.java where all the attributes are assigned.
        //dis() same to Productservice class 
        return courseservice.dis(id );
    }

    @RequestMapping("/Students/{studentId}/products/{productId}/courses/{id}")//{id} refers nested url.
    public Course getCourse(@PathVariable String id) { //@PathVariable for nested url.
        return courseservice.getCourse(id);
    }

   
    @RequestMapping(method = RequestMethod.POST, value = "/Students/{studentId}/products/{productId}/courses") //RequestMethod.POST used for handling POST requests.
    public void  addCourses( @PathVariable String productId,@RequestBody Course course , @PathVariable String studentId ){ //course is obj for course class, we r passing obj as a parameter.
        course.setProduct(new Products(productId, "", "", studentId));
         courseservice.addCourses(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Students/{studentId}/products/{productId}/courses/{id}")
    public void  updatecourses(@RequestBody Course course,@PathVariable String productId, @PathVariable String studentId){
        course.setProduct(new Products(productId, "", "", studentId));
        courseservice.updatecourses(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Students/{studentId}/products/{productid}/couses/{id}")//{id} refers nested url.
    public void deletecourses(@PathVariable String id) { //@PathVariable for nested url.
        courseservice.deletecourses(id);
    }
    

    

}
