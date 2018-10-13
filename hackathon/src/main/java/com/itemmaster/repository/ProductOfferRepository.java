package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemmaster.models.ProductOffer;

public interface ProductOfferRepository extends JpaRepository<ProductOffer, Long> {

}
