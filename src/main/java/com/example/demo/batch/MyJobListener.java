package com.example.demo.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyJobListener.class);
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		LOGGER.info(String.format("================ JOB STARTED ================"));
		JobExecutionListener.super.beforeJob(jobExecution);
	}
	
	@Override
	public void afterJob(JobExecution jobExecution) {
		LOGGER.info(String.format("================ JOB ENDED ================"));
		JobExecutionListener.super.afterJob(jobExecution);
	}
}