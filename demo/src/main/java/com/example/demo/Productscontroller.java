package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//When the class is declared for controller must use @RestController
@RestController
public class Productscontroller {
    //Products products=new Products();

    @Autowired
    private Productservice productservice;

    //@RequestMapping is used for get method
    @RequestMapping("/products")
    public List<Products> dis() { //<Products> denotes Products.java where all the attributes are assigned.
        //dis() same to Productservice class 
        return productservice.dis();
    }

    @RequestMapping("/products/{id}")//{id} refers nested url.
    public Products getProducts(@PathVariable String id) { //@PathVariable for nested url.
        return productservice.getProducts(id);
    }

   
    @RequestMapping(method = RequestMethod.POST, value = "/products") //RequestMethod.POST used for handling POST requests.
    public void  addproducts(@RequestBody Products products){ //products is obj for Products class, we r passing obj as a parameter.
         productservice.addproducts(products);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void  updateproduct(@RequestBody Products products,@PathVariable String id){
        productservice.updateproduct(products, id);
    }
    

    

}
