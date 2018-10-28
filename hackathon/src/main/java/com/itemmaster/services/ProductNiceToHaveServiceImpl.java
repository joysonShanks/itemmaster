package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductNiceToHave;
import com.itemmaster.repository.ProductNiceToHaveRepository;

@Service
public class ProductNiceToHaveServiceImpl implements ProductNiceToHaveService {

	@Autowired
	ProductNiceToHaveRepository productNiceToHaveRepository;

	@Override
	public void save(ProductNiceToHave productNiceToHave) {
		productNiceToHaveRepository.save(productNiceToHave);
	}

	@Override
	public Optional<ProductNiceToHave> findById(long id) {
		return productNiceToHaveRepository.findById(id);
	}

}
