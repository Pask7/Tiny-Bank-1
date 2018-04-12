package com.tinybank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinybank.api.web.Account;
import com.tinybank.api.web.Customer;

@Component
public class AccountService {

	@Autowired 
	Account account;
	public Account openAccount(String id,Customer customer,String displayName)
	{
		account = new Account(id, customer, displayName);
		return account;
		
	}
}
