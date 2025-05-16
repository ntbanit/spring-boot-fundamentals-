package com.example.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.jpa.controller.ProductController;
import com.example.demo.jpa.entity.Product;
import com.example.demo.jpa.repo.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@WebMvcTest(ProductController.class)
public class Section15ProductControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private ProductRepository productRepository;
//
//	@Test
//	void getAllProducts_ShouldReturnProductList() throws Exception {
//		// Arrange
//		Product product1 = new Product(1, "Product 1", "", 10.0);
//		Product product2 = new Product(2, "Product 2", "", 20.0);
//		List<Product> products = Arrays.asList(product1, product2);
//
//		when(productRepository.findAll()).thenReturn(products);
//
//		// Act & Assert
//		mockMvc.perform(get("/products").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//				.andExpect(content().json("""
//						[
//						    {"id":1,"name":"Product 1","description":"","price":10.0},
//						    {"id":2,"name":"Product 2","description":"","price":20.0}
//						]
//						"""));
//	}
//
//	@Test
//	void createProduct_ShouldReturnCreatedProduct() throws Exception {
//		// Arrange
//		Product productToCreate = new Product(1, "New Product", "Description", 30.0);
//		Product createdProduct = new Product(3, "New Product", "Description", 30.0);
//
//		when(productRepository.save(any(Product.class))).thenReturn(createdProduct);
//
//		// Act & Assert
//		mockMvc.perform(
//				post("/products").contentType(MediaType.APPLICATION_JSON).content(asJsonString(productToCreate)))
//				.andExpect(status().isOk()).andExpect(content().json(asJsonString(createdProduct)));
//	}
//
//	@Test
//	void updateProduct_ShouldReturnUpdatedProduct() throws Exception {
//		// Arrange
//		Product updatedProduct = new Product(1, "Updated Product", "Updated Description", 40.0);
//
//		when(productRepository.findById(1)).thenReturn(Optional.of(new Product(1, "Product 1", "", 10.0)));
//		when(productRepository.save(any(Product.class))).thenReturn(updatedProduct);
//
//		// Act & Assert
//		mockMvc.perform(
//				put("/products/1").contentType(MediaType.APPLICATION_JSON).content(asJsonString(updatedProduct)))
//				.andExpect(status().isOk()).andExpect(content().json(asJsonString(updatedProduct)));
//	}
//
//	@Test
//	void deleteProduct_ShouldReturnNoContent() throws Exception {
//		// Arrange
//		doNothing().when(productRepository).deleteById(1);
//
//		// Act & Assert
//		mockMvc.perform(delete("/products/1")).andExpect(status().isOk());
//	}
//
//	private static String asJsonString(final Object obj) throws JsonProcessingException {
//		return new ObjectMapper().writeValueAsString(obj);
//	}

}