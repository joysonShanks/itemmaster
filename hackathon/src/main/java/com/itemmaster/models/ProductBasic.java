package com.itemmaster.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.itemmaster.utils.ProductStatus;

@Entity(name = "productbasic")
public class ProductBasic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	private String sku;
	private String productName;
	private String productIdType;
	private String productId;
	private String producuctIdentifier;
	private String shortDescription;
	private String keyFeatures;
	private String unitsPerConsumerUnit;
	private String brand;
	private String manufacturer;
	private String manufacturePartName;
	private String modelNumber;

	@Enumerated(EnumType.STRING)
	private ProductStatus productStatus;

	public ProductStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductIdType() {
		return productIdType;
	}

	public void setProductIdType(String productIdType) {
		this.productIdType = productIdType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getKeyFeatures() {
		return keyFeatures;
	}

	public void setKeyFeatures(String keyFeatures) {
		this.keyFeatures = keyFeatures;
	}

	public String getUnitsPerConsumerUnit() {
		return unitsPerConsumerUnit;
	}

	public void setUnitsPerConsumerUnit(String unitsPerConsumerUnit) {
		this.unitsPerConsumerUnit = unitsPerConsumerUnit;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturePartName() {
		return manufacturePartName;
	}

	public void setManufacturePartName(String manufacturePartName) {
		this.manufacturePartName = manufacturePartName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getProducuctIdentifier() {
		return producuctIdentifier;
	}

	public void setProducuctIdentifier(String producuctIdentifier) {
		this.producuctIdentifier = producuctIdentifier;
	}

}
