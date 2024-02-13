package com.project.mentorbabaa.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.mentorbabaa.banking.Account;
import com.project.mentorbabaa.banking.AccountService;

@SpringBootTest
public class TestAccountService {

	@Autowired
	AccountService accountService;
	
	@Test
	public void testAccountRegistraiton() {
		Account account = new Account(1010101010,"Shubham","Saving Account",20000.0);
		assertEquals(account.getAccountNumber(),accountService.registerDummyAccount().getAccountNumber());
		assertEquals(account.getAccountName(),accountService.registerDummyAccount().getAccountName());
	}
}
