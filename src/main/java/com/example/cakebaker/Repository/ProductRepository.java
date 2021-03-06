package com.example.cakebaker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cakebaker.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
