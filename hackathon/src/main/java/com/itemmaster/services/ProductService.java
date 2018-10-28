package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.Product;

public interface ProductService {

	public long save(Product product);

	public void update(Product product);

	public Optional<Product> findById(Long productId);
}
