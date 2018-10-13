package com.itemmaster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductBasic;
import com.itemmaster.repository.ProductBasicRepository;

public class ProductBasicServiceImpl implements ProductBasicService {

	@Autowired
	ProductBasicRepository productBasicRepository;

	@Override
	public void save(ProductBasic productBasic) {
		productBasicRepository.save(productBasic);
	}

	@Override
	public List<ProductBasic> getAllProductBasic() {
		return productBasicRepository.findAll();
	}
}
