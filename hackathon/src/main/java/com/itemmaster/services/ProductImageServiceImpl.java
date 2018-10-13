package com.itemmaster.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductImage;
import com.itemmaster.repository.ProductImageRepository;

public class ProductImageServiceImpl implements ProductImageService {

	@Autowired
	ProductImageRepository productImageRepository;

	@Override
	public void save(ProductImage productImage) {
		productImageRepository.save(productImage);
	}

}
