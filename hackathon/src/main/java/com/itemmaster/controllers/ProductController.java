package com.itemmaster.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemmaster.models.Product;
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
import com.itemmaster.services.ProductService;
import com.itemmaster.utils.DataEntryException;
import com.itemmaster.utils.ProductResponse;
import com.itemmaster.utils.ProductStatus;
import com.itemmaster.utils.RuleEngine;

@RestController
public class ProductController extends BaseController {

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

	@Autowired
	RuleEngine ruleEngine;

	@Autowired
	ProductService productService;

	@RequestMapping(path = "/product-basic", method = RequestMethod.POST)
	public ResponseEntity<ProductResponse> saveProductBasic(@RequestBody ProductBasic productBasic) {
		try {
			ruleEngine.checkProductIdTypeRule(productBasic);
		} catch (DataEntryException de) {
			ProductResponse productResponse = new ProductResponse();
			productResponse.setId(0L);
			productResponse.setMessage(de.getMessage());
			return new ResponseEntity<>(productResponse, HttpStatus.BAD_REQUEST);
		}
		productBasicService.save(productBasic);
		ProductResponse productResponse = new ProductResponse();
		productResponse.setId(1L);
		productResponse.setMessage("Product Baisc created");
		return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-basic", method = RequestMethod.GET)
	public List<ProductBasic> getAllProductBasic() {
		return productBasicService.getAllProductBasic();
	}

	@RequestMapping(path = "/product-additional-categories", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductBasic(
			@RequestBody ProductAdditionalCategories productAdditionalCategories) {
		productAdditionalService.save(productAdditionalCategories);
		return new ResponseEntity<>("Product Additional Categories created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-compliance", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductBasic(@RequestBody ProductCompliance productCompliance) {
		productComplianceService.save(productCompliance);
		return new ResponseEntity<>("Product Compliance created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-nice-to-have", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductNiteToHave(@RequestBody ProductNiceToHave productNiteToHave) {
		productNiceToHaveService.save(productNiteToHave);
		return new ResponseEntity<>("Product Nice to have created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-offer", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductImage(@RequestBody ProductOffer productoffer) {
		productOfferService.save(productoffer);
		return new ResponseEntity<>("Product Offer created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-image", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductImage(@RequestBody ProductImage productImage) {
		productImageService.save(productImage);
		return new ResponseEntity<>("Product Image created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product-discoverability", method = RequestMethod.POST)
	public ResponseEntity<String> saveProductOffer(@RequestBody ProductDiscoverability productDiscoverability) {
		productDiscoverabilityService.save(productDiscoverability);
		return new ResponseEntity<>("Product Discoverability created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product/{productId}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProduct(@PathVariable Long productId) {
		Optional<Product> product = productService.findById(productId);
		if (!product.isPresent()) {
			return new ResponseEntity<Product>(new Product(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
	}

	@RequestMapping(path = "/product", method = RequestMethod.POST)
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		// https://stackoverflow.com/questions/13370221/jpa-hibernate-detached-entity-passed-to-persist
		product.setPoductBasic(productBasicService.findProductBasicById(product.getPoductBasic().getId()).get());
		product.setProductAdditionalCategories(
				productAdditionalService.findById(product.getProductAdditionalCategories().getId()).get());
		product.setProductCompliance(productComplianceService.findById(product.getProductCompliance().getId()).get());
		product.setProductDiscoverability(
				productDiscoverabilityService.findById(product.getProductDiscoverability().getId()).get());
		product.setProductImage(productImageService.findById(product.getProductImage().getId()).get());
		product.setProductNiceToHave(productNiceToHaveService.findById(product.getProductNiceToHave().getId()).get());
		product.setProductOffer(productOfferService.findById(product.getProductOffer().getId()).get());
		productService.save(product);
		return new ResponseEntity<>("Product created ", HttpStatus.CREATED);
	}

	@RequestMapping(path = "/product", method = RequestMethod.PUT)
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		productService.update(product);
		return new ResponseEntity<>("Product updated ", HttpStatus.OK);
	}

	@RequestMapping(path = "/product/admin/{action}/{productId}", method = RequestMethod.POST)
	public ResponseEntity<String> finalizeProduct(@PathVariable String action, @PathVariable Long productId) {
		Optional<Product> productOptional = productService.findById(productId);
		if (!productOptional.isPresent()) {
			return new ResponseEntity<>("Invalid product id", HttpStatus.NOT_FOUND);
		}
		Product product = productOptional.get();
		if (action.equals(ProductStatus.APPROVED.toString())) {
			product.setProductStatus(ProductStatus.APPROVED);
		} else if (action.equals(ProductStatus.REJECTED.toString())) {
			product.setProductStatus(ProductStatus.REJECTED);
		} else {
			return new ResponseEntity<>("Not a valid action", HttpStatus.BAD_REQUEST);
		}

		// set approved by
		product.setApprovedBy("username");
		productService.update(productOptional.get());
		return new ResponseEntity<>("Product " + action, HttpStatus.OK);
	}

}
