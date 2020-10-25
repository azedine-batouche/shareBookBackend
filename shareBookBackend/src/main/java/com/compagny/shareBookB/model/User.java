package com.compagny.shareBookB.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

	private String idUser;

	@NotBlank
	@Size(min = 5, max = 20)
	private String lastName;

	@NotBlank
	@Size(min = 5, max = 20)
	private String firstName;

	@NotBlank
	@Size(min = 5, max = 20)
	private List<Book> books;

}
