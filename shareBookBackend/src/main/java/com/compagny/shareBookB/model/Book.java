package com.compagny.shareBookB.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;



@Data
public class Book {

	private String bookId;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String name;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String cathegory;

	
}
