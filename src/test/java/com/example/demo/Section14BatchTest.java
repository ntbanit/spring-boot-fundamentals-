package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class Section14BatchTest {
//	@Autowired
//	Job job ;
//	
//	@Autowired
//	JobLauncher launcher;
//	
//	@Autowired
//    private ApplicationContext context; // Ensures context is loaded
//	
//	@Test
//	void testBatch() throws Exception{
//		JobParameters parameters = new JobParametersBuilder()
//				.addLong("time", System.currentTimeMillis()) // Unique parameter
//				.toJobParameters();
//		launcher.run(job, parameters);
//	}
}
