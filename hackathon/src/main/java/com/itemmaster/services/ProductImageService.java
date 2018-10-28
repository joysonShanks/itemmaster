package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductImage;

public interface ProductImageService {

	public void save(ProductImage productImage);
	
	public Optional<ProductImage> findById(long id);
}
