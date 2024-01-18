package com.topQueen.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topQueen.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
