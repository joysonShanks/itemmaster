package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductAdditionalCategories;
import com.itemmaster.repository.ProductAdditionalCategoriesRepository;

@Service
public class ProductAdditionalCategoriesImpl implements ProductAdditionalService {

	@Autowired
	ProductAdditionalCategoriesRepository productAdditionalCategoriesRepository;

	@Override
	public void save(ProductAdditionalCategories productAdditionalCategories) {
		productAdditionalCategoriesRepository.save(productAdditionalCategories);
	}

	@Override
	public Optional<ProductAdditionalCategories> findById(long id) {
		return productAdditionalCategoriesRepository.findById(id);
	}

	/*@Override
	public Optional<ProductAdditionalCategories> findByProductBasicId(long productBasicId) {
		return Optional.of(productAdditionalCategoriesRepository.findByProductBasicId(productBasicId));
	}*/
	
	

}
