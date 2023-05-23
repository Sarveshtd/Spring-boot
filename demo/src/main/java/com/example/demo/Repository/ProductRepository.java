//repository is used to connect db

package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Class.Products;

public interface ProductRepository extends CrudRepository<Products, String> { //CrudRepository  is also an interface
    
}
