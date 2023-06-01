//repository is used to connect db

package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Class.Products;

public interface ProductRepository extends JpaRepository<Products, String> { //CrudRepository  is also an interface
    
    public List<Products> findByStudentsId(String studentId); //ProductsId means Product class acts as an argument in Course class so added like this

}
