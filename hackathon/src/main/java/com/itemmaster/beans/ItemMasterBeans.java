package com.itemmaster.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itemmaster.services.ProductAdditionalCategoriesImpl;
import com.itemmaster.services.ProductAdditionalService;
import com.itemmaster.services.ProductBasicService;
import com.itemmaster.services.ProductBasicServiceImpl;
import com.itemmaster.services.ProductComplianceService;
import com.itemmaster.services.ProductComplianceServiceImpl;
import com.itemmaster.services.ProductDiscoverabilityService;
import com.itemmaster.services.ProductDiscoverabilityServiceImpl;
import com.itemmaster.services.ProductImageService;
import com.itemmaster.services.ProductImageServiceImpl;
import com.itemmaster.services.ProductNiceToHaveService;
import com.itemmaster.services.ProductNiceToHaveServiceImpl;
import com.itemmaster.services.ProductOfferService;
import com.itemmaster.services.ProductOfferServiceImpl;
import com.itemmaster.services.UserService;
import com.itemmaster.services.UserServiceImpl;

@Configuration
public class ItemMasterBeans {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public ProductBasicService productBasicService() {
		return new ProductBasicServiceImpl();
	}
	
	@Bean
	public ProductAdditionalService productAdditionalService() {
		return new ProductAdditionalCategoriesImpl();
	}
	
	@Bean
	public ProductComplianceService productComplianceService() {
		return new ProductComplianceServiceImpl();
	}
	
	@Bean
	public ProductImageService productImageService() {
		return new ProductImageServiceImpl();
	}
	
	@Bean
	public ProductNiceToHaveService productNiceToHaveService() {
		return new ProductNiceToHaveServiceImpl();
	}
	
	@Bean
	public ProductOfferService productOfferService() {
		return new ProductOfferServiceImpl();
	}
	
	@Bean
	public ProductDiscoverabilityService productDiscoverabilityService() {
		return new ProductDiscoverabilityServiceImpl();
	}
}
