package com.masai.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.security.entity.Customer;
import com.masai.security.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	
	@Override
	public Customer registerCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		return customerRepo.findByEmail(email).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

}
