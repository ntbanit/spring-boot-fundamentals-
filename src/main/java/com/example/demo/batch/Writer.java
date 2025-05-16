package com.example.demo.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {
	private static final Logger LOGGER = LoggerFactory.getLogger(Writer.class) ;
	@Override
	public void write(Chunk<? extends String> chunk) throws Exception {
		LOGGER.info(String.format("================ write chunk={%s} ================", chunk));
		System.out.println("Writing data " + chunk);
	}

}
