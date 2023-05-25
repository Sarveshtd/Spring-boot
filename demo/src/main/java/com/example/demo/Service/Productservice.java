package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Class.Products;
import com.example.demo.Repository.ProductRepository;

@Service
public class Productservice {

    @Autowired
    private ProductRepository productRepository;
    
    // private List<Products> product= new ArrayList<>(Arrays.asList( //return from array to arraylist
    //             new Products("food", "sambar", "healthy"),
    //             new Products("snacks", "lays", "not healthy"),
    //             new Products("sports", "cricket", "healthy")
    //             ));

    public List<Products> dis(){ //dis() is same as Productcontroller class 
        List<Products> product = new ArrayList<>();
        productRepository.findAll().forEach(product :: add);
        return product;
    }

    public Products getProducts(String id){
        //return product.stream().filter(t -> t.getId().equals(id)).findFirst().get(); // we use lambda fn.
        return productRepository.findById(id).orElse(null);
    }

    public void addproducts(Products products){
          productRepository.save(products);
        
    }

    public void updateproduct(Products products ,String id) {
        // for (int i = 0; i < product.size(); i++) {
        //     Products t =product.get(i);
        //     if(t.getId().equals(id)){
        //         product.set(i,products);
        //         //return;
        //     }
            
        // }
        productRepository.save(products);
    }

    public void deleteProducts( String id) { //@PathVariable for nested url.
        //  product.removeIf(t -> t.getId().equals(id));
        productRepository.deleteById(id);
    }
}
