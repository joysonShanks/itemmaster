package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemmaster.models.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {

}