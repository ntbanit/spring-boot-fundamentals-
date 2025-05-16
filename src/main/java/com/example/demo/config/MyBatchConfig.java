package com.example.demo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.example.demo.batch.MyJobListener;
import com.example.demo.batch.Processor;
import com.example.demo.batch.Reader;
import com.example.demo.batch.Writer;
//@Configuration
//@EnableBatchProcessing
public class MyBatchConfig {
//	@Autowired
//	private JobRepository jobRepository;
//	@Autowired
//	private PlatformTransactionManager transactionManager;
//	@Bean
//    public Job job() {
//        return new JobBuilder("myJob", jobRepository)
//                .start(step())
//                .listener(listener())
//                .build();
//    }
//	
//	@Bean
//	public Step step() {
//		StepBuilder sb = new StepBuilder("job-1", jobRepository);
//		return sb
//				.<String, String>chunk(2, transactionManager)
//				.reader(reader())
//				.processor(processor())
//				.writer(writer())
//				.build();
//	}
//	
//	@Bean
//	public Reader reader() {
//		return new Reader();
//	}
//
//    @Bean
//    public Writer writer() {
//        return new Writer();
//    }
//
//    @Bean
//    public Processor processor() {
//        return new Processor();
//    }
//
//    @Bean
//    public MyJobListener listener() {
//        return new MyJobListener();
//    }
}
