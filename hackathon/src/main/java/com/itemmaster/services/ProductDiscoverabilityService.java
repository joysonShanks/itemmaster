package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductDiscoverability;

public interface ProductDiscoverabilityService {

	public void save(ProductDiscoverability productDiscoverability);
	
	Optional<ProductDiscoverability> findById(long id);
}
