package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.Product;
import com.itemmaster.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository; 
	
	@Override
	public long save(Product product) {
		return productRepository.save(product).getId();
	}

	@Override
	public void update(Product product) {
		
	}

	@Override
	public Optional<Product> findById(Long productId) {
		return productRepository.findById(productId);
	}

}
