package com.itemmaster.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productadditionalcategories")
public class ProductAdditionalCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private Float alcoholContentByVolume;
	private String alcoholProof;
	private String alcoholClassAndType;
	private String neutralSpiritsColoringAndFlavoring;
	private String wineAppellation;
	private String wineVarietal;
	private Integer vIntegerage;
	private Boolean isNonGrape;
	private Boolean isEstateBottled;
	private Boolean containsSulfites;
	private String timeAged;
	private String[] ingredients;
	private String containerType;
	private Boolean isGmoFree;
	private Float servingSize;
	private Integer servingsPerContainer;
	private Integer calories;
	private Integer caloriesFromFat;
	private Integer totalFat;
	private Float totalFatPercentageDailyValue;
	private Integer fatCaloriesPerGram;
	private Integer totalCarbohydrate;
	private Float totalCarbohydratePercentageDailyValue;
	private Integer carbohydrateCaloriesPerGram;
	private String nutrientName;
	private Integer nutrientAmount;
	private Float nutrientPercentageDailyValue;
	private String nutrientFootnote;
	private String nutrients;
	private Integer proteinCaloriesPerGram;
	private Float totalProteinPercentageDailyValue;
	private Integer totalProtein;
	private String foodForm;
	private Boolean isImitation;
	private Boolean usdaInspected;
	private Boolean hasHighFructoseCornSyrup;
	private String foodAllergenStatements;
	private String instructions;
	private String caffeineDesignation;
	private String spiceLevel;
	private Boolean isMadeInHomeKitchen;
	private String beefCut;
	private String poultryCut;
	private Date releaseDate;
	private Boolean isHealthyIncentive;
	private Boolean isSnapEligible;
	private Boolean isWICEligible;

	public Long getId() {
		return id;
	}

	public Float getAlcoholContentByVolume() {
		return alcoholContentByVolume;
	}

	public void setAlcoholContentByVolume(Float alcoholContentByVolume) {
		this.alcoholContentByVolume = alcoholContentByVolume;
	}

	public String getAlcoholProof() {
		return alcoholProof;
	}

	public void setAlcoholProof(String alcoholProof) {
		this.alcoholProof = alcoholProof;
	}

	public String getAlcoholClassAndType() {
		return alcoholClassAndType;
	}

	public void setAlcoholClassAndType(String alcoholClassAndType) {
		this.alcoholClassAndType = alcoholClassAndType;
	}

	public String getNeutralSpiritsColoringAndFlavoring() {
		return neutralSpiritsColoringAndFlavoring;
	}

	public void setNeutralSpiritsColoringAndFlavoring(String neutralSpiritsColoringAndFlavoring) {
		this.neutralSpiritsColoringAndFlavoring = neutralSpiritsColoringAndFlavoring;
	}

	public String getWineAppellation() {
		return wineAppellation;
	}

	public void setWineAppellation(String wineAppellation) {
		this.wineAppellation = wineAppellation;
	}

	public String getWineVarietal() {
		return wineVarietal;
	}

	public void setWineVarietal(String wineVarietal) {
		this.wineVarietal = wineVarietal;
	}

	public Integer getvIntegerage() {
		return vIntegerage;
	}

	public void setvIntegerage(Integer vIntegerage) {
		this.vIntegerage = vIntegerage;
	}

	public Boolean getIsNonGrape() {
		return isNonGrape;
	}

	public void setIsNonGrape(Boolean isNonGrape) {
		this.isNonGrape = isNonGrape;
	}

	public Boolean getIsEstateBottled() {
		return isEstateBottled;
	}

	public void setIsEstateBottled(Boolean isEstateBottled) {
		this.isEstateBottled = isEstateBottled;
	}

	public Boolean getContainsSulfites() {
		return containsSulfites;
	}

	public void setContainsSulfites(Boolean containsSulfites) {
		this.containsSulfites = containsSulfites;
	}

	public String getTimeAged() {
		return timeAged;
	}

	public void setTimeAged(String timeAged) {
		this.timeAged = timeAged;
	}

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public Boolean getIsGmoFree() {
		return isGmoFree;
	}

	public void setIsGmoFree(Boolean isGmoFree) {
		this.isGmoFree = isGmoFree;
	}

	public Float getServingSize() {
		return servingSize;
	}

	public void setServingSize(Float servingSize) {
		this.servingSize = servingSize;
	}

	public Integer getServingsPerContainer() {
		return servingsPerContainer;
	}

	public void setServingsPerContainer(Integer servingsPerContainer) {
		this.servingsPerContainer = servingsPerContainer;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCaloriesFromFat() {
		return caloriesFromFat;
	}

	public void setCaloriesFromFat(Integer caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public Integer getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Integer totalFat) {
		this.totalFat = totalFat;
	}

	public Float getTotalFatPercentageDailyValue() {
		return totalFatPercentageDailyValue;
	}

	public void setTotalFatPercentageDailyValue(Float totalFatPercentageDailyValue) {
		this.totalFatPercentageDailyValue = totalFatPercentageDailyValue;
	}

	public Integer getFatCaloriesPerGram() {
		return fatCaloriesPerGram;
	}

	public void setFatCaloriesPerGram(Integer fatCaloriesPerGram) {
		this.fatCaloriesPerGram = fatCaloriesPerGram;
	}

	public Integer getTotalCarbohydrate() {
		return totalCarbohydrate;
	}

	public void setTotalCarbohydrate(Integer totalCarbohydrate) {
		this.totalCarbohydrate = totalCarbohydrate;
	}

	public Float getTotalCarbohydratePercentageDailyValue() {
		return totalCarbohydratePercentageDailyValue;
	}

	public void setTotalCarbohydratePercentageDailyValue(Float totalCarbohydratePercentageDailyValue) {
		this.totalCarbohydratePercentageDailyValue = totalCarbohydratePercentageDailyValue;
	}

	public Integer getCarbohydrateCaloriesPerGram() {
		return carbohydrateCaloriesPerGram;
	}

	public void setCarbohydrateCaloriesPerGram(Integer carbohydrateCaloriesPerGram) {
		this.carbohydrateCaloriesPerGram = carbohydrateCaloriesPerGram;
	}

	public String getNutrientName() {
		return nutrientName;
	}

	public void setNutrientName(String nutrientName) {
		this.nutrientName = nutrientName;
	}

	public Integer getNutrientAmount() {
		return nutrientAmount;
	}

	public void setNutrientAmount(Integer nutrientAmount) {
		this.nutrientAmount = nutrientAmount;
	}

	public Float getNutrientPercentageDailyValue() {
		return nutrientPercentageDailyValue;
	}

	public void setNutrientPercentageDailyValue(Float nutrientPercentageDailyValue) {
		this.nutrientPercentageDailyValue = nutrientPercentageDailyValue;
	}

	public String getNutrientFootnote() {
		return nutrientFootnote;
	}

	public void setNutrientFootnote(String nutrientFootnote) {
		this.nutrientFootnote = nutrientFootnote;
	}

	public String getNutrients() {
		return nutrients;
	}

	public void setNutrients(String nutrients) {
		this.nutrients = nutrients;
	}

	public Integer getProteinCaloriesPerGram() {
		return proteinCaloriesPerGram;
	}

	public void setProteinCaloriesPerGram(Integer proteinCaloriesPerGram) {
		this.proteinCaloriesPerGram = proteinCaloriesPerGram;
	}

	public Float getTotalProteinPercentageDailyValue() {
		return totalProteinPercentageDailyValue;
	}

	public void setTotalProteinPercentageDailyValue(Float totalProteinPercentageDailyValue) {
		this.totalProteinPercentageDailyValue = totalProteinPercentageDailyValue;
	}

	public Integer getTotalProtein() {
		return totalProtein;
	}

	public void setTotalProtein(Integer totalProtein) {
		this.totalProtein = totalProtein;
	}

	public String getFoodForm() {
		return foodForm;
	}

	public void setFoodForm(String foodForm) {
		this.foodForm = foodForm;
	}

	public Boolean getIsImitation() {
		return isImitation;
	}

	public void setIsImitation(Boolean isImitation) {
		this.isImitation = isImitation;
	}

	public Boolean getUsdaInspected() {
		return usdaInspected;
	}

	public void setUsdaInspected(Boolean usdaInspected) {
		this.usdaInspected = usdaInspected;
	}

	public Boolean getHasHighFructoseCornSyrup() {
		return hasHighFructoseCornSyrup;
	}

	public void setHasHighFructoseCornSyrup(Boolean hasHighFructoseCornSyrup) {
		this.hasHighFructoseCornSyrup = hasHighFructoseCornSyrup;
	}

	public String getFoodAllergenStatements() {
		return foodAllergenStatements;
	}

	public void setFoodAllergenStatements(String foodAllergenStatements) {
		this.foodAllergenStatements = foodAllergenStatements;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getCaffeineDesignation() {
		return caffeineDesignation;
	}

	public void setCaffeineDesignation(String caffeineDesignation) {
		this.caffeineDesignation = caffeineDesignation;
	}

	public String getSpiceLevel() {
		return spiceLevel;
	}

	public void setSpiceLevel(String spiceLevel) {
		this.spiceLevel = spiceLevel;
	}

	public Boolean getIsMadeInHomeKitchen() {
		return isMadeInHomeKitchen;
	}

	public void setIsMadeInHomeKitchen(Boolean isMadeInHomeKitchen) {
		this.isMadeInHomeKitchen = isMadeInHomeKitchen;
	}

	public String getBeefCut() {
		return beefCut;
	}

	public void setBeefCut(String beefCut) {
		this.beefCut = beefCut;
	}

	public String getPoultryCut() {
		return poultryCut;
	}

	public void setPoultryCut(String poultryCut) {
		this.poultryCut = poultryCut;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Boolean getIsHealthyIncentive() {
		return isHealthyIncentive;
	}

	public void setIsHealthyIncentive(Boolean isHealthyIncentive) {
		this.isHealthyIncentive = isHealthyIncentive;
	}

	public Boolean getIsSnapEligible() {
		return isSnapEligible;
	}

	public void setIsSnapEligible(Boolean isSnapEligible) {
		this.isSnapEligible = isSnapEligible;
	}

	public Boolean getIsWICEligible() {
		return isWICEligible;
	}

	public void setIsWICEligible(Boolean isWICEligible) {
		this.isWICEligible = isWICEligible;
	}
}
