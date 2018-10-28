package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductDiscoverability;
import com.itemmaster.repository.ProductDiscoverablityRepository;

@Service
public class ProductDiscoverabilityServiceImpl implements ProductDiscoverabilityService {

	@Autowired
	ProductDiscoverablityRepository productDiscoverablityRepository;

	@Override
	public void save(ProductDiscoverability productDiscoverability) {
		productDiscoverablityRepository.save(productDiscoverability);
	}

	@Override
	public Optional<ProductDiscoverability> findById(long id) {
		return productDiscoverablityRepository.findById(id);
	}

}
