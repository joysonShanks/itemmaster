package com.itemmaster.utils;

import com.itemmaster.models.ProductBasic;

public class RuleEngine {

	public void checkProductIdTypeRule(ProductBasic productBasic) throws DataEntryException {
		if (productBasic.getSku().isEmpty()) {
			throw new DataEntryException("Product name can not be empty");
		} else if (productBasic.getProductName().isEmpty()) {
			throw new DataEntryException("Product name can not be empty");
		} else if (productBasic.getProductId().isEmpty()) {
			throw new DataEntryException("Product id can not be empty");
		} else if (productBasic.getProductIdType().isEmpty()) {
			throw new DataEntryException("Product id type can not be empty");
		} else if (productBasic.getProducuctIdentifier().isEmpty()) {
			throw new DataEntryException("Product identifers can not be empty");
		} else if (productBasic.getShortDescription().isEmpty()) {
			throw new DataEntryException("Product short description can not be empty");
		} else if (!(productBasic.getProductIdType().equals("UPC") || productBasic.getProductIdType().equals("GTIN")
				|| productBasic.getProductIdType().equals("ISBN") || productBasic.getProductIdType().equals("EAN"))) {
			throw new DataEntryException("Not a valid product id type");
		} else if (!productBasic.getProducuctIdentifier().isEmpty()) {
			String id = productBasic.getProductId();
			if (productBasic.getProductIdType().equals("UPC")) {
				if (id.length() > 12) {
					throw new DataEntryException("Invalid product id");
				} else {
					productBasic.setProductId(String.format("%12s", id));
				}
			} else if (productBasic.getProductIdType().equals("GTIN")) {
				if (id.length() > 14) {
					throw new DataEntryException("Invalid product id");
				} else {
					productBasic.setProductId(String.format("%14s", id));
				}
			} else if (productBasic.getProductIdType().equals("ISBN")) {
				if (id.length() == 13) {
					productBasic.setProductId(String.format("%13s", id));
				} else if(id.length() == 10) {
					productBasic.setProductId(String.format("%10s", id));
				} else {
					throw new DataEntryException("Invalid product id");
				}
			} else {
				if (id.length() > 13) {
					throw new DataEntryException("Invalid product id");
				} else {
					productBasic.setProductId(String.format("%13s", id));
				}
			}
		}
	}
}
