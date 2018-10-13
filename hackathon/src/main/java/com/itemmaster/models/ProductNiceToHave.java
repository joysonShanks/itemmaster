package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "productnicetohave")
public class ProductNiceToHave {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private Boolean SkuUpdate;
	private String safeHandlingInstructions;
	private String cuisine;
	private String foodPreparationTips;
	private String foodStorageTips;
	private String character;

	@OneToOne
	@JoinColumn
	private ProductBasic productBasic;

	public Boolean isSkuUpdate() {
		return SkuUpdate;
	}

	public void setSkuUpdate(Boolean skuUpdate) {
		SkuUpdate = skuUpdate;
	}

	public String getSafeHandlingInstructions() {
		return safeHandlingInstructions;
	}

	public void setSafeHandlingInstructions(String safeHandlingInstructions) {
		this.safeHandlingInstructions = safeHandlingInstructions;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getFoodPreparationTips() {
		return foodPreparationTips;
	}

	public void setFoodPreparationTips(String foodPreparationTips) {
		this.foodPreparationTips = foodPreparationTips;
	}

	public String getFoodStorageTips() {
		return foodStorageTips;
	}

	public void setFoodStorageTips(String foodStorageTips) {
		this.foodStorageTips = foodStorageTips;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public ProductBasic getProductBasic() {
		return productBasic;
	}

	public void setProductBasic(ProductBasic productBasic) {
		this.productBasic = productBasic;
	}

}
