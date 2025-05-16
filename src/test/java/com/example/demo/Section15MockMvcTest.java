package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.jpa.controller.ProductController;
import com.example.demo.jpa.entity.Product;
import com.example.demo.jpa.repo.ProductRepository;

@ExtendWith(MockitoExtension.class)
class Section15MockMvcTest {

	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductController productController; 

	@Test
	void testFindAll() {
		// Arrange
		List<Product> products = Arrays.asList(new Product(1, "CD Beginer", "AKB48", 10.0),
				new Product(2, "Album Graduation Kitarie", "NGT48", 20.0));
		when(productRepository.findAll()).thenReturn(products);

		// Act
		List<Product> result = productController.getAllProducts();

		// Assert
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals("CD Beginer", result.get(0).getName());
		assertEquals("Album Graduation Kitarie", result.get(1).getName());
	}
}