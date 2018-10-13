package com.itemmaster.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemmaster.models.ProductAdditionalCategories;
import com.itemmaster.models.ProductBasic;
import com.itemmaster.models.ProductCompliance;
import com.itemmaster.models.ProductDiscoverability;
import com.itemmaster.models.ProductImage;
import com.itemmaster.models.ProductNiceToHave;
import com.itemmaster.models.ProductOffer;
import com.itemmaster.services.ProductAdditionalService;
import com.itemmaster.services.ProductBasicService;
import com.itemmaster.services.ProductComplianceService;
import com.itemmaster.services.ProductDiscoverabilityService;
import com.itemmaster.services.ProductImageService;
import com.itemmaster.services.ProductNiceToHaveService;
import com.itemmaster.services.ProductOfferService;

@RestController
public class ProductController {

	@Autowired
	ProductBasicService productBasicService;

	@Autowired
	ProductAdditionalService productAdditionalService;

	@Autowired
	ProductComplianceService productComplianceService;

	@Autowired
	ProductImageService productImageService;

	@Autowired
	ProductNiceToHaveService productNiceToHaveService;

	@Autowired
	ProductOfferService productOfferService;

	@Autowired
	ProductDiscoverabilityService productDiscoverabilityService;

	@RequestMapping(path = "/product-basic", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductBasic(@RequestBody ProductBasic productBasic, ModelMap map) {
		if (productBasic.getSku().isEmpty()) {
			return new ResponseEntity<>("SKU can not be empty", HttpStatus.BAD_REQUEST);
		} else if(productBasic.getProductName().isEmpty()) {
			return new ResponseEntity<>("Product name can not be empty", HttpStatus.BAD_REQUEST);
		} else if(productBasic.getProductId().isEmpty()) {
			return new ResponseEntity<>("Product id can not be empty", HttpStatus.BAD_REQUEST);
		} else if(productBasic.getProductIdType().isEmpty()) {
			return new ResponseEntity<>("Product id type can not be empty", HttpStatus.BAD_REQUEST);
		} else if(!productBasic.getProductIdType().equals("UPC") || !productBasic.getProductIdType().equals("GTIN") || 
				productBasic.getProductIdType().equals("ISBN") || productBasic.getProductIdType().equals("EAN")) {
			return new ResponseEntity<>("Not a valid product id type", HttpStatus.BAD_REQUEST);
		} else if(productBasic.getProducuctIdentifier().isEmpty()) {
			return new ResponseEntity<>("Product identifers can not be empty", HttpStatus.BAD_REQUEST);
		} else if(!productBasic.getProducuctIdentifier().isEmpty()) {
			if(productBasic.getProductIdType().equals("UPC")) {
				String id = productBasic.getProductId();
				if(id.length() > 12) {
					new ResponseEntity<>("Invalid product id", HttpStatus.BAD_REQUEST);
				} else {
					productBasic.setProductId(String.format("%012d", id));
				}
			}
		} else if(productBasic.getShortDescription().isEmpty()) {
			return new ResponseEntity<>("Product short description can not be empty", HttpStatus.BAD_REQUEST);
		}
		productBasicService.save(productBasic);

		return new ResponseEntity<>("Product Baisc created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-basic", method = RequestMethod.GET)
	public List<ProductBasic> getAllProductBasic() {
		return productBasicService.getAllProductBasic();
	}

	@RequestMapping(path = "/product-additional-categories", method = RequestMethod.POST)
	public void saveProductBasic(@RequestBody ProductAdditionalCategories productAdditionalCategories, ModelMap map) {
		productAdditionalService.save(productAdditionalCategories);
	}

	@RequestMapping(path = "/product-compliance", method = RequestMethod.POST)
	public void saveProductBasic(@RequestBody ProductCompliance productCompliance, ModelMap map) {
		productComplianceService.save(productCompliance);
	}

	@RequestMapping(path = "/product-nice-to-have", method = RequestMethod.POST)
	public void saveProductNiteToHave(@RequestBody ProductNiceToHave productNiteToHave, ModelMap map) {
		productNiceToHaveService.save(productNiteToHave);
	}

	@RequestMapping(path = "/product-image", method = RequestMethod.POST)
	public void saveProductImage(@RequestBody ProductOffer productoffer, ModelMap map) {
		productOfferService.save(productoffer);
	}

	@RequestMapping(path = "/product-offer", method = RequestMethod.POST)
	public void saveProductOffer(@RequestBody ProductImage productImage, ModelMap map) {
		productImageService.save(productImage);
	}

	@RequestMapping(path = "/product-discoverability", method = RequestMethod.POST)
	public void saveProductOffer(@RequestBody ProductDiscoverability productDiscoverability, ModelMap map) {
		productDiscoverabilityService.save(productDiscoverability);
	}

}
