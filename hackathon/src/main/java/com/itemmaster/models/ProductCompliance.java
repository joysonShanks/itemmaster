package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Boolean hasPricePerUnit;
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
	
	public Long getId() {
		return id;
	}

	public Boolean getIsPrivateLabelOrUnbranded() {
		return isPrivateLabelOrUnbranded;
	}

	public void setIsPrivateLabelOrUnbranded(Boolean isPrivateLabelOrUnbranded) {
		this.isPrivateLabelOrUnbranded = isPrivateLabelOrUnbranded;
	}

	public Boolean getIsExclusiveBrandsIndicator() {
		return isExclusiveBrandsIndicator;
	}

	public void setIsExclusiveBrandsIndicator(Boolean isExclusiveBrandsIndicator) {
		this.isExclusiveBrandsIndicator = isExclusiveBrandsIndicator;
	}

	public Boolean getIsProp65WarningRequired() {
		return isProp65WarningRequired;
	}

	public void setIsProp65WarningRequired(Boolean isProp65WarningRequired) {
		this.isProp65WarningRequired = isProp65WarningRequired;
	}

	public String getProp65WarningText() {
		return prop65WarningText;
	}

	public void setProp65WarningText(String prop65WarningText) {
		this.prop65WarningText = prop65WarningText;
	}

	public Boolean getHasExpiration() {
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

	public Boolean getHasPricePerUnit() {
		return hasPricePerUnit;
	}

	public void setHasPricePerUnit(Boolean hasPricePerUnit) {
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

	public Boolean getHasGMOs() {
		return hasGMOs;
	}

	public void setHasGMOs(Boolean hasGMOs) {
		this.hasGMOs = hasGMOs;
	}

	public Boolean getIsTemperatureSensitive() {
		return isTemperatureSensitive;
	}

	public void setIsTemperatureSensitive(Boolean isTemperatureSensitive) {
		this.isTemperatureSensitive = isTemperatureSensitive;
	}

	public Boolean getHasStateRestrictions() {
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

	public Boolean getIsIntegerendedForHumanConsumption() {
		return isIntegerendedForHumanConsumption;
	}

	public void setIsIntegerendedForHumanConsumption(Boolean isIntegerendedForHumanConsumption) {
		this.isIntegerendedForHumanConsumption = isIntegerendedForHumanConsumption;
	}

	public Boolean getIsNutritionFactsLabelRequired() {
		return isNutritionFactsLabelRequired;
	}

	public void setIsNutritionFactsLabelRequired(Boolean isNutritionFactsLabelRequired) {
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

	public Boolean getHasIngredientList() {
		return hasIngredientList;
	}

	public void setHasIngredientList(Boolean hasIngredientList) {
		this.hasIngredientList = hasIngredientList;
	}

	public Boolean getIsPerishable() {
		return isPerishable;
	}

	public void setIsPerishable(Boolean isPerishable) {
		this.isPerishable = isPerishable;
	}
}
