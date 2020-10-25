package com.compagny.shareBookB.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.compagny.shareBookB.model.Loan;

@RestController
public class LoanController {

	@GetMapping("/users/{userId}/loans")
	public List<Loan> getLoans(@PathVariable("userId") String userId) {
		Loan loan =  new Loan();
		loan.setAskDate(new Date());
		
		return Arrays.asList(loan);
	}
	
	@PostMapping("/users/{userId}/loans/{loanId]")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Loan createLoan(@PathVariable("userId") String userId, @PathVariable("loanId") String loanId) {
			Loan loan = new Loan();
			loan.setAskDate(new Date());
			return loan;
	}
	
	@GetMapping("/users/{userId}/loans/{loanId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteLoan(@PathVariable("userId") String userId, @PathVariable("loanId") String loanId ) {
			}
}
