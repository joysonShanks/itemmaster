package com.itemmaster.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.itemmaster.utils.ProductStatus;

@Entity(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductBasic.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductBasic poductBasic;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductAdditionalCategories.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductAdditionalCategories productAdditionalCategories;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductCompliance.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductCompliance productCompliance;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductDiscoverability.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductDiscoverability productDiscoverability;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductImage.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductImage productImage;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductNiceToHave.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductNiceToHave productNiceToHave;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = ProductOffer.class, cascade = CascadeType.ALL)
	@JoinColumn
	private ProductOffer productOffer;

	@Enumerated(EnumType.STRING)
	private ProductStatus productStatus;

	private String approvedBy;

	public Long getId() {
		return id;
	}

	/*public void setId(Long id) {
		this.id = id;
	}*/

	public ProductBasic getPoductBasic() {
		return poductBasic;
	}

	public void setPoductBasic(ProductBasic poductBasic) {
		this.poductBasic = poductBasic;
	}

	public ProductAdditionalCategories getProductAdditionalCategories() {
		return productAdditionalCategories;
	}

	public void setProductAdditionalCategories(ProductAdditionalCategories productAdditionalCategories) {
		this.productAdditionalCategories = productAdditionalCategories;
	}

	public ProductCompliance getProductCompliance() {
		return productCompliance;
	}

	public void setProductCompliance(ProductCompliance productCompliance) {
		this.productCompliance = productCompliance;
	}

	public ProductDiscoverability getProductDiscoverability() {
		return productDiscoverability;
	}

	public void setProductDiscoverability(ProductDiscoverability productDiscoverability) {
		this.productDiscoverability = productDiscoverability;
	}

	public ProductImage getProductImage() {
		return productImage;
	}

	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}

	public ProductNiceToHave getProductNiceToHave() {
		return productNiceToHave;
	}

	public void setProductNiceToHave(ProductNiceToHave productNiceToHave) {
		this.productNiceToHave = productNiceToHave;
	}

	public ProductOffer getProductOffer() {
		return productOffer;
	}

	public void setProductOffer(ProductOffer productOffer) {
		this.productOffer = productOffer;
	}

	public ProductStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

}
