package com.example.demo.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/** Section 14 : Spring Batch*/
public class Reader implements ItemReader<String> {
	private String[] courses = {
		    "Introduction to Computer Science",
		    "Data Structures and Algorithms",
		    "Database Systems",
		    "Software Engineering",
		    "Artificial Intelligence"
		};

	private int count;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Inside reader");
		String data = null ;
		if (count < courses.length) {
			data = courses[count ++] ;
		} else {
			count = 0 ;
		}
		System.out.println("Return data="+data);
		return data;
	}

}
