package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itemmaster.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
