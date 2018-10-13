package com.itemmaster.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductCompliance;
import com.itemmaster.repository.ProductComplianceRepository;

public class ProductComplianceServiceImpl implements ProductComplianceService {

	@Autowired
	ProductComplianceRepository productComplianceRepository;

	@Override
	public void save(ProductCompliance productCompliance) {
		productComplianceRepository.save(productCompliance);
	}

}
