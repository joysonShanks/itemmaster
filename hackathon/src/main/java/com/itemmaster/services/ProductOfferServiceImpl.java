package com.itemmaster.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemmaster.models.ProductOffer;
import com.itemmaster.repository.ProductOfferRepository;

@Service
public class ProductOfferServiceImpl implements ProductOfferService {

	@Autowired
	ProductOfferRepository productOfferRepository;

	@Override
	public void save(ProductOffer productOffer) {
		productOfferRepository.save(productOffer);
	}

	@Override
	public Optional<ProductOffer> findById(long id) {
		return productOfferRepository.findById(id);
	}

}
