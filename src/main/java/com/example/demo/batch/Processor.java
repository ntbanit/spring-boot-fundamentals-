package com.example.demo.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {
	private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class);
	@Override
	public String process(String item) throws Exception {
		LOGGER.info(String.format("================ process item={%s} ================", item));
		return "PROCESSED "+ item;
	}

}
