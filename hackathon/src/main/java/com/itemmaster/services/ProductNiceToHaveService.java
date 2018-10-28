package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductNiceToHave;

public interface ProductNiceToHaveService {

	public void save(ProductNiceToHave productNiceToHave);
	
	public Optional<ProductNiceToHave> findById(long id);
}
