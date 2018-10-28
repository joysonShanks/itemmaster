package com.itemmaster.services;

import java.util.Optional;

import com.itemmaster.models.ProductOffer;

public interface ProductOfferService {

	public void save(ProductOffer productOffer);
	
	Optional<ProductOffer> findById(long id);
}
