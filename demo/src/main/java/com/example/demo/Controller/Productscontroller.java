package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Class.Products;
import com.example.demo.Class.Students;
import com.example.demo.Service.Productservice;

//When the class is declared for controller must use @RestController
@RestController
public class Productscontroller {
    //Products products=new Products();

    @Autowired
    private Productservice productservice;

    //@RequestMapping is used for get method
    @RequestMapping("/Students/{id}/products")
    public List<Products> dis(@PathVariable  String id) { //<Products> denotes Products.java where all the attributes are assigned.
        //dis() same to Productservice class 
        return productservice.dis(id);
    }

    @RequestMapping("/Students/{studentId}/products/{id}")//{id} refers nested url.
    public Products getProducts(@PathVariable String id) { //@PathVariable for nested url.
        return productservice.getProducts(id);
    }

   
    @RequestMapping(method = RequestMethod.POST, value = "/Students/{studentId}/products") //RequestMethod.POST used for handling POST requests.
    public void  addproducts(@RequestBody Products products ,@PathVariable String studentId){ //products is obj for Products class, we r passing obj as a parameter.
        products.setStudents(new Students("", studentId, "", ""));
         productservice.addproducts(products);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Students/{studentId}/products/{id}")
    public void  updateproduct(@RequestBody Products products,@PathVariable String id, @PathVariable String studentId){
        products.setStudents(new Students("", studentId, "", ""));
        productservice.updateproduct(products);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Students/{studentId}/products/{id}")//{id} refers nested url.
    public void deleteProducts(@PathVariable String id) { //@PathVariable for nested url.
        productservice.deleteProducts(id);
    }
    

    

}
