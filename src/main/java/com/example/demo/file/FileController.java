package com.example.demo.file;

import java.io.File;
import org.springframework.http.HttpHeaders;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {
	@Value("${uploadDir}")
	private String UPLOAD_DIR;

	@PostMapping("/upload")
	public boolean upload(@RequestParam("file") MultipartFile file) throws Exception {
		file.transferTo(new File(UPLOAD_DIR + file.getOriginalFilename()));
		return true;
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<byte[]> download(@PathVariable("fileName") String fileName) throws Exception {
		byte[] fileData = Files.readAllBytes(new File(UPLOAD_DIR + fileName).toPath());
		
		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.IMAGE_JPEG);
		headers.setContentType(MediaType.IMAGE_PNG);
		return new ResponseEntity<byte[]>(fileData, headers, HttpStatus.OK);
	}
}
