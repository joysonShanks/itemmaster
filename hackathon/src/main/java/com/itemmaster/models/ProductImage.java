package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productimage")
public class ProductImage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private String mainImageUrl;
	private String productSecondaryImageURL;

	public Long getId() {
		return id;
	}

	public String getMainImageUrl() {
		return mainImageUrl;
	}

	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	public String getProductSecondaryImageURL() {
		return productSecondaryImageURL;
	}

	public void setProductSecondaryImageURL(String productSecondaryImageURL) {
		this.productSecondaryImageURL = productSecondaryImageURL;
	}

}
