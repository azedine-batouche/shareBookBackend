package com.compagny.shareBookB.model;

import java.util.Date;

import lombok.Data;

@Data
public class Loan {
	private String id;
	
	private User borower;
	
	private User lender;
	
	private Book book;
	
	private Date askDate;
	
	
	private Date closeDate;

	
}
