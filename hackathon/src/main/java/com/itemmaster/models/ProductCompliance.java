package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "productcompliance")
public class ProductCompliance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private Boolean isPrivateLabelOrUnbranded;
	private Boolean isExclusiveBrandsIndicator;
	private Boolean isProp65WarningRequired;
	private String prop65WarningText;
	private Boolean hasExpiration;
	private Integer shelfLife;
	private Integer hasPricePerUnit;
	private Integer pricePerUnitQuantity;
	private String pricePerUnitUom;
	private Boolean hasGMOs;
	private Boolean isTemperatureSensitive;
	private Boolean hasStateRestrictions;
	private String[] states;
	private Integer[] zipCodes;
	private String stateRestrictionsText;
	private String stateRestrictions;
	private Boolean isIntegerendedForHumanConsumption;
	private Boolean isNutritionFactsLabelRequired;

	// images
	private String nutritionFactsLabel;
	private String nutritionIngredientsImage;
	private String ingredientListImage;

	private Boolean hasIngredientList;
	private Boolean isPerishable;

	@OneToOne
	@JoinColumn
	private ProductBasic productBasic;

	public Boolean isPrivateLabelOrUnbranded() {
		return isPrivateLabelOrUnbranded;
	}

	public void setPrivateLabelOrUnbranded(Boolean isPrivateLabelOrUnbranded) {
		this.isPrivateLabelOrUnbranded = isPrivateLabelOrUnbranded;
	}

	public Boolean isExclusiveBrandsIndicator() {
		return isExclusiveBrandsIndicator;
	}

	public void setExclusiveBrandsIndicator(Boolean isExclusiveBrandsIndicator) {
		this.isExclusiveBrandsIndicator = isExclusiveBrandsIndicator;
	}

	public Boolean isProp65WarningRequired() {
		return isProp65WarningRequired;
	}

	public void setProp65WarningRequired(Boolean isProp65WarningRequired) {
		this.isProp65WarningRequired = isProp65WarningRequired;
	}

	public String getProp65WarningText() {
		return prop65WarningText;
	}

	public void setProp65WarningText(String prop65WarningText) {
		this.prop65WarningText = prop65WarningText;
	}

	public Boolean isHasExpiration() {
		return hasExpiration;
	}

	public void setHasExpiration(Boolean hasExpiration) {
		this.hasExpiration = hasExpiration;
	}

	public Integer getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(Integer shelfLife) {
		this.shelfLife = shelfLife;
	}

	public Integer getHasPricePerUnit() {
		return hasPricePerUnit;
	}

	public void setHasPricePerUnit(Integer hasPricePerUnit) {
		this.hasPricePerUnit = hasPricePerUnit;
	}

	public Integer getPricePerUnitQuantity() {
		return pricePerUnitQuantity;
	}

	public void setPricePerUnitQuantity(Integer pricePerUnitQuantity) {
		this.pricePerUnitQuantity = pricePerUnitQuantity;
	}

	public String getPricePerUnitUom() {
		return pricePerUnitUom;
	}

	public void setPricePerUnitUom(String pricePerUnitUom) {
		this.pricePerUnitUom = pricePerUnitUom;
	}

	public Boolean isHasGMOs() {
		return hasGMOs;
	}

	public void setHasGMOs(Boolean hasGMOs) {
		this.hasGMOs = hasGMOs;
	}

	public Boolean isTemperatureSensitive() {
		return isTemperatureSensitive;
	}

	public void setTemperatureSensitive(Boolean isTemperatureSensitive) {
		this.isTemperatureSensitive = isTemperatureSensitive;
	}

	public Boolean isHasStateRestrictions() {
		return hasStateRestrictions;
	}

	public void setHasStateRestrictions(Boolean hasStateRestrictions) {
		this.hasStateRestrictions = hasStateRestrictions;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public Integer[] getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(Integer[] zipCodes) {
		this.zipCodes = zipCodes;
	}

	public String getStateRestrictionsText() {
		return stateRestrictionsText;
	}

	public void setStateRestrictionsText(String stateRestrictionsText) {
		this.stateRestrictionsText = stateRestrictionsText;
	}

	public String getStateRestrictions() {
		return stateRestrictions;
	}

	public void setStateRestrictions(String stateRestrictions) {
		this.stateRestrictions = stateRestrictions;
	}

	public Boolean isIntegerendedForHumanConsumption() {
		return isIntegerendedForHumanConsumption;
	}

	public void setIntegerendedForHumanConsumption(Boolean isIntegerendedForHumanConsumption) {
		this.isIntegerendedForHumanConsumption = isIntegerendedForHumanConsumption;
	}

	public Boolean isNutritionFactsLabelRequired() {
		return isNutritionFactsLabelRequired;
	}

	public void setNutritionFactsLabelRequired(Boolean isNutritionFactsLabelRequired) {
		this.isNutritionFactsLabelRequired = isNutritionFactsLabelRequired;
	}

	public String getNutritionFactsLabel() {
		return nutritionFactsLabel;
	}

	public void setNutritionFactsLabel(String nutritionFactsLabel) {
		this.nutritionFactsLabel = nutritionFactsLabel;
	}

	public String getNutritionIngredientsImage() {
		return nutritionIngredientsImage;
	}

	public void setNutritionIngredientsImage(String nutritionIngredientsImage) {
		this.nutritionIngredientsImage = nutritionIngredientsImage;
	}

	public String getIngredientListImage() {
		return ingredientListImage;
	}

	public void setIngredientListImage(String ingredientListImage) {
		this.ingredientListImage = ingredientListImage;
	}

	public Boolean isHasIngredientList() {
		return hasIngredientList;
	}

	public void setHasIngredientList(Boolean hasIngredientList) {
		this.hasIngredientList = hasIngredientList;
	}

	public Boolean isPerishable() {
		return isPerishable;
	}

	public void setPerishable(Boolean isPerishable) {
		this.isPerishable = isPerishable;
	}

	public ProductBasic getProductBasic() {
		return productBasic;
	}

	public void setProductBasic(ProductBasic productBasic) {
		this.productBasic = productBasic;
	}
}
