package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemmaster.models.ProductCompliance;

public interface ProductComplianceRepository extends JpaRepository<ProductCompliance, Long> {
}
