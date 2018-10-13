package com.itemmaster.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductDiscoverability;
import com.itemmaster.repository.ProductDiscoverablityRepository;

public class ProductDiscoverabilityServiceImpl implements ProductDiscoverabilityService {

	@Autowired
	ProductDiscoverablityRepository productDiscoverablityRepository;

	@Override
	public void save(ProductDiscoverability productDiscoverability) {
		productDiscoverablityRepository.save(productDiscoverability);
	}

}
