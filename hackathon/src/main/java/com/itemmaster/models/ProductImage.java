package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "productimage")
public class ProductImage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@OneToOne
	@JoinColumn
	private ProductBasic productBasic;

	private String mainImageUrl;
	private String productSecondaryImageURL;

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

	public ProductBasic getProductBasic() {
		return productBasic;
	}

	public void setProductBasic(ProductBasic productBasic) {
		this.productBasic = productBasic;
	}

}
