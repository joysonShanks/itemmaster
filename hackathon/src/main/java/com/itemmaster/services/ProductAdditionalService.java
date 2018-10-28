package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductAdditionalCategories;

public interface ProductAdditionalService {
	public void save(ProductAdditionalCategories productAdditionalCategories);
	
	//public Optional<ProductAdditionalCategories> findByProductBasicId(long productBasicId);
	public Optional<ProductAdditionalCategories> findById(long id);
}
