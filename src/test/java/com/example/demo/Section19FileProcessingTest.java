package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

//@SpringBootTest
public class Section19FileProcessingTest {
	private static final String FILE_UPLOAD_URL = "http://localhost:8080/api/upload";
	private static final String FILE_DOWNLOAD_URL = "http://localhost:8080/api/download/";
	String fileName = "trump.png" ;
//	@Autowired
//	RestTemplate restTemplate;
//
//	@Test
//	void testUpload() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//
//		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
//		body.add("file", new ClassPathResource(fileName));
//
//		HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(body, headers);
//		ResponseEntity<Boolean> response = restTemplate.postForEntity(FILE_UPLOAD_URL, httpEntity, Boolean.class);
//		System.out.println(response.getBody());
//	}
//	
//	@Test
//	void testDownload() throws IOException {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
//		
//		HttpEntity<String> httpEntity = new HttpEntity<>(headers) ;
//		ResponseEntity<byte[]> responseEntity = restTemplate.exchange(FILE_DOWNLOAD_URL +fileName, HttpMethod.GET, httpEntity, byte[].class);
//		
//		Files.write(Paths.get("C:/test-download/" + fileName), responseEntity.getBody());
//	}
}
