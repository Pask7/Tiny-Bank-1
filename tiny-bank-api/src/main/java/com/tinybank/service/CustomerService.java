package com.tinybank.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinybank.api.web.Account;
import com.tinybank.api.web.Customer;

@Component
public class CustomerService {
	
	@Autowired
	Customer customer;

	public Customer addCustomer(String id, String name, String surname, Date birthDate, String address, List<Account> accounts)
	{
		accounts = null; // Nowy klient nie posiada jeszcze kont w naszym banku
		customer = new Customer(id, name, surname, birthDate, address, accounts);
		return customer;
		
	}
}
