package com.tinybank.api.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private final String id;
    private final String name;
    private final String surname;
    private final Date birthDate;
    private final String address;
    private final ArrayList<Account> accounts;

    public Customer(String id, String name, String surname, Date birthDate, String address, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.accounts = new ArrayList<Account>(accounts);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Account> getAccounts() {
        return new ArrayList<Account>(accounts);
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate
				+ ", address=" + address + ", accounts=" + accounts + "]";
	}
}