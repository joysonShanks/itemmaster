package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "productoffer")
public class ProductOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@OneToOne
	@JoinColumn
	private ProductBasic productBasic;

	private String msrp;

	public String getMsrp() {
		return msrp;
	}

	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}

	public ProductBasic getProductBasic() {
		return productBasic;
	}

	public void setProductBasic(ProductBasic productBasic) {
		this.productBasic = productBasic;
	}
}
