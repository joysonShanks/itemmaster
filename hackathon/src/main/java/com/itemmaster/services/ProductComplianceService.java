package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductCompliance;

public interface ProductComplianceService {

	public void save(ProductCompliance productCompliance);
	
	public Optional<ProductCompliance> findById(long id);
}
