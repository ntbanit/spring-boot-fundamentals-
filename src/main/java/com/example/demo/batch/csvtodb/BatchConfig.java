package com.example.demo.batch.csvtodb;
//
////import javax.sql.DataSource;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.item.ItemProcessor;
//import org.springframework.batch.item.ItemReader;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
//import org.springframework.batch.item.database.JdbcBatchItemWriter;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.batch.item.file.mapping.DefaultLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.transaction.PlatformTransactionManager;
//
////@Configuration
////@EnableBatchProcessing
//public class BatchConfig {
////	
////	@Autowired
////	DataSource dataSource;
////	
////	@Autowired
////	private JobRepository jobRepository;
////	
////	@Autowired
////	private PlatformTransactionManager transactionManager;
////	
////	@Bean
////    public Job jobOne() {
////        return new JobBuilder("job-1", jobRepository)
////                .flow(step())
////                .end()
////                .build();
////    }
////	
////	@Bean
////	public Step step() {
////		StepBuilder sb = new StepBuilder("step-1", jobRepository);
////		return sb
////				.<Goods, Goods>chunk(5, transactionManager)
////				.reader(myReader())
////				.processor(myProcessor())
////				.writer(myWriter())
////				.build();
////	}
////	
////	@Bean
////	public ItemReader<Goods> myReader() {
////		FlatFileItemReader<Goods> reader = new FlatFileItemReader<>();
////		reader.setResource(new ClassPathResource("goods.csv"));
////
////		DefaultLineMapper<Goods> lineMapper = new DefaultLineMapper<>();
////		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
////		lineTokenizer.setNames(new String[] { "id", "name", "description", "price" });
////		BeanWrapperFieldSetMapper<Goods> setMapper = new BeanWrapperFieldSetMapper<>();
////		setMapper.setTargetType(Goods.class);		
////		lineMapper.setLineTokenizer(lineTokenizer);
////		lineMapper.setFieldSetMapper(setMapper);
////			
////		reader.setLineMapper(lineMapper);
////		reader.setLinesToSkip(1);
////
////		return reader;
////	}
////
////	@Bean
////	public ItemProcessor<Goods, Goods> myProcessor() {
////		return (p) -> {
////			// VAT fee
////			p.setPrice(p.getPrice() * 1.1);
////			return p;
////		};
////	}
////	
////	@Bean
////	public ItemWriter<Goods> myWriter(){
////		JdbcBatchItemWriter<Goods> writer = new JdbcBatchItemWriter<>();
////		writer.setDataSource(dataSource);
////		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
////		writer.setSql("INSERT INTO goods(id, name, description, price) VALUES (:id, :name, :description, :price)");
////		return writer ;
////		
////	}
//}

public class BatchConfig {

}