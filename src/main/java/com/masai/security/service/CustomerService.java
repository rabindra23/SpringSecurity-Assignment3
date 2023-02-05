package com.masai.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.security.entity.Customer;

@Service
public interface CustomerService {

	public Customer registerCustomer(Customer customer);
	public Customer getCustomerByEmail(String email);
	public List<Customer> getAllCustomers();
}
