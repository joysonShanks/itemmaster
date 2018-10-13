package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemmaster.models.ProductNiceToHave;

public interface ProductNiceToHaveRepository extends JpaRepository<ProductNiceToHave, Long> {

}
