package com.itemmaster.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductNiceToHave;
import com.itemmaster.repository.ProductNiceToHaveRepository;

public class ProductNiceToHaveServiceImpl implements ProductNiceToHaveService {

	@Autowired
	ProductNiceToHaveRepository productNiceToHaveRepository;

	@Override
	public void save(ProductNiceToHave productNiceToHave) {
		productNiceToHaveRepository.save(productNiceToHave);
	}

}
