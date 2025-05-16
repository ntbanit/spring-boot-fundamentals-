package com.example.demo.batch.csvtodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
	private Integer id;
	private String name;
	private String description;
	private Double price;
}
