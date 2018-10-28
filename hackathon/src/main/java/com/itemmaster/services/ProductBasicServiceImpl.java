package com.itemmaster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductBasic;
import com.itemmaster.repository.ProductBasicRepository;

@Service
public class ProductBasicServiceImpl implements ProductBasicService {

	@Autowired
	ProductBasicRepository productBasicRepository;

	@Override
	public void save(ProductBasic productBasic) {
		productBasicRepository.save(productBasic);
	}

	@Override
	public List<ProductBasic> getAllProductBasic() {
		return productBasicRepository.findAll();
	}

	@Override
	public Optional<ProductBasic> findProductBasicById(long id) {
		return productBasicRepository.findById(id);
	}

}
