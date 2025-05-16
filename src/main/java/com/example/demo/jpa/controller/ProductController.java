package com.example.demo.jpa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.entity.Product;
import com.example.demo.jpa.repo.ProductRepository;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

/*** Section #6 - Create REST CRUD API # */
@RestController
@RequestMapping("/products")
@Tag(name = "Product REST")
@Validated
public class ProductController {

	/*** Section #9 - Logger # */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	@Hidden
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@GetMapping("/{id}")
//	@Transactional(readOnly= true)
//	@Cacheable("product-cache")
	@Operation(summary = "Return information of product", description = "200 ok with response body. 500 error if the id nto exists")
	public @ApiResponse(description = "object product") Product getProductById(@Parameter(description = "product id") @PathVariable int id) {
		LOGGER.info(String.format("================ getProductById with id={%d}================", id));
		return productRepository.findById(id).get();
	}

	@PostMapping
	public Product createProduct(@Valid @RequestBody Product product) {
		return productRepository.save(product);
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product productDetails) {
		Product product = productRepository.findById(id).get();

		product.setName(productDetails.getName());
		product.setDescription(productDetails.getDescription());
		product.setPrice(productDetails.getPrice());
		productRepository.save(product);
		
		return product;
	}

	@DeleteMapping("/{id}")
//	@CacheEvict("product-cache")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
}
