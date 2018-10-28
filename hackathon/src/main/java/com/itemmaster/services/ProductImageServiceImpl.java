package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductImage;
import com.itemmaster.repository.ProductImageRepository;

@Service
public class ProductImageServiceImpl implements ProductImageService {

	@Autowired
	ProductImageRepository productImageRepository;

	@Override
	public void save(ProductImage productImage) {
		productImageRepository.save(productImage);
	}

	@Override
	public Optional<ProductImage> findById(long id) {
		return productImageRepository.findById(id);
	}

}
