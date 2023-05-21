package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Productservice {
    private List<Products> product= new ArrayList<>(Arrays.asList( //return from array to arraylist
                new Products("food", "sambar", "healthy"),
                new Products("snacks", "lays", "not healthy"),
                new Products("sports", "cricket", "healthy")
                ));

    public List<Products> dis(){ //dis() is same as Productcontroller class 
        return product;
    }

    public Products getProducts(String id){
        return product.stream().filter(t -> t.getId().equals(id)).findFirst().get(); // we use lambda fn.
    }

    public void addproducts(Products products){
          product.add(products);
        
    }

    public void updateproduct(Products products ,String id) {
        for (int i = 0; i < product.size(); i++) {
            Products t =product.get(i);
            if(t.getId().equals(id)){
                product.set(i,products);
                //return;
            }
            
        }
    }
}
