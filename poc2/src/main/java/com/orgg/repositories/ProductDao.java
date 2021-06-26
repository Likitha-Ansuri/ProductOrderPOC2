package com.orgg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orgg.models.Products;

public interface ProductDao extends JpaRepository<Products, Integer>{

}
