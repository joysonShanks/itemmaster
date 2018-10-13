package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemmaster.models.ProductBasic;

public interface ProductBasicRepository extends JpaRepository<ProductBasic, Long> {

}
