package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.jpa.entity.Product;

/** SECTION #7: REST Client */
@SpringBootTest
class ProductControllerTest {
	
	/** START: SECTION #8: Spring Profiles*/
	@Value("${products.services.url}")
	private String BASE_URL;
	
	/** END: SECTION #8: Spring Profiles*/
	
	@Test
	public void placeHolder() {
		// skip test case when mvn clean build because
		// (this file have to run after the application run to success)
		assertEquals(1 + 2, 3);
	}
//    @Test
//    public void testCreateProduct() {
//    	
//    	System.out.println("CHECK PROFILES: " + BASE_URL);
//    	
//    	
//    	RestTemplate restTemplate = new RestTemplate();
//        Product product = new Product();
//        product.setName("Test Product");
//        product.setDescription("This is a test product");
//        product.setPrice(100.0);
//
//        Product response = restTemplate.postForObject(BASE_URL, product, Product.class);
//        assertEquals(response.getName(), product.getName());
//        assertEquals(response.getDescription(), product.getDescription());
//        assertEquals(response.getPrice(), product.getPrice());
//    }
//    
//    @Test
//    public void testGetAllProducts() {
//    	RestTemplate restTemplate = new RestTemplate();
//    	ResponseEntity<Product[]> response = restTemplate.getForEntity(BASE_URL, Product[].class);
//        assertEquals(response.getStatusCode().value(), 200);
//        assertNotNull(response.getBody());
//    }
//
//    @Test
//    public void testGetProductById() {
//    	RestTemplate restTemplate = new RestTemplate();
//        int id = 3; // assume id = 3 existed 
//        ResponseEntity<Product> response = restTemplate.getForEntity(BASE_URL + id, Product.class);
//        assertEquals(response.getStatusCode().value(), 200);
//        assertNotNull(response.getBody());
//        assertEquals(response.getBody().getId(), id);
//    }
//
//
//    @Test
//    public void testUpdateProduct() {
//    	RestTemplate restTemplate = new RestTemplate();
//        int id = 7; // assume id = 7 existed 
//        Product productDetails = new Product();
//        productDetails.setName("Updated Product");
//        productDetails.setDescription("This is an updated product");
//        productDetails.setPrice(200.0);
//
//		HttpEntity<Product> request = new HttpEntity<>(productDetails);
//		ResponseEntity<Product> response = restTemplate.exchange(BASE_URL + id, HttpMethod.PUT, request,
//				Product.class);
//        assertEquals(response.getStatusCode().value(), 200);
//        assertNotNull(response.getBody());
//        assertEquals(response.getBody().getName(), productDetails.getName());
//        assertEquals(response.getBody().getDescription(), productDetails.getDescription());
//        assertEquals(response.getBody().getPrice(), productDetails.getPrice());
//    }

//    @Test
//    public void testDeleteProduct() {
//    	RestTemplate restTemplate = new RestTemplate();
//        int id = 6;
//        restTemplate.delete(URL + "/" + id);
//        HttpServerErrorException exception = assertThrows(HttpServerErrorException.class, () -> {
//            restTemplate.getForEntity(BASE_URL + id, String.class);
//        });
//        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, exception.getStatusCode());
//    }
}
