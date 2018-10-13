package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "productdiscoverability")
public class ProductDiscoverability {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private String flavour;
	private Boolean isReadyToEat;
	private Integer count;
	private Integer size;

	@OneToOne
	@JoinColumn
	private ProductBasic productBasic;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Boolean getIsReadyToEat() {
		return isReadyToEat;
	}

	public void setIsReadyToEat(Boolean isReadyToEat) {
		this.isReadyToEat = isReadyToEat;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public ProductBasic getProductBasic() {
		return productBasic;
	}

	public void setProductBasic(ProductBasic productBasic) {
		this.productBasic = productBasic;
	}
}
