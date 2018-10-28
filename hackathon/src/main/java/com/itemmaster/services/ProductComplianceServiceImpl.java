package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductCompliance;
import com.itemmaster.repository.ProductComplianceRepository;

@Service
public class ProductComplianceServiceImpl implements ProductComplianceService {

	@Autowired
	ProductComplianceRepository productComplianceRepository;

	@Override
	public void save(ProductCompliance productCompliance) {
		productComplianceRepository.save(productCompliance);
	}

	@Override
	public Optional<ProductCompliance> findById(long id) {
		return productComplianceRepository.findById(id);
	}

}
