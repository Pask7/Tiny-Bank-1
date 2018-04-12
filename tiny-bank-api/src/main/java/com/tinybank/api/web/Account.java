package com.tinybank.api.web;

import org.springframework.stereotype.Component;

/**
 * Created by pkalamucki on 05.04.2018.
 */

@Component
public class Account {
    private final String id;
    private final Customer customer;
    private final String displayName;

    public Account(String id, Customer customer, String displayName) {
        this.id = id;
        this.customer = customer;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDisplayName() {
        return displayName;
    }
}