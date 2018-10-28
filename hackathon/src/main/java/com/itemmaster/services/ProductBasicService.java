package com.itemmaster.services;

import java.util.List;
import java.util.Optional;

import com.itemmaster.models.ProductBasic;

public interface ProductBasicService {
	public void save(ProductBasic productBasic);
	
	public List<ProductBasic> getAllProductBasic();
	
	public Optional<ProductBasic> findProductBasicById(long productBasicId);
}
