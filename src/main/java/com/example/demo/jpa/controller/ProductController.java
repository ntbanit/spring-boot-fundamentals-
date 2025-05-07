package com.example.demo.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productRepository.findById(id).get();
	}

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
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
	public ResponseEntity<Object> deleteProduct(@PathVariable int id) {
		return productRepository.findById(id).map(product -> {
			productRepository.delete(product);
			return ResponseEntity.noContent().build();
		}).orElse(ResponseEntity.notFound().build());
	}
}
