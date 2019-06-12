package com.example.web.service.repository;

import com.example.web.service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    //this class you can write code for want to do with Model of DB

}
