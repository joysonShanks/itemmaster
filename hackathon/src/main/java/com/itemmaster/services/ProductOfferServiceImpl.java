package com.itemmaster.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.itemmaster.models.ProductOffer;
import com.itemmaster.repository.ProductOfferRepository;

public class ProductOfferServiceImpl implements ProductOfferService {

	@Autowired
	ProductOfferRepository productOfferRepository;

	@Override
	public void save(ProductOffer productOffer) {
		productOfferRepository.save(productOffer);
	}

}
