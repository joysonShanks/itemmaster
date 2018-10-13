package com.itemmaster.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductBasic;

@Service
public interface ProductBasicService {
	public void save(ProductBasic productBasic);
	
	public List<ProductBasic> getAllProductBasic();
}
