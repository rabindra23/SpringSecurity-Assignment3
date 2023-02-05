package com.masai.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.security.entity.Customer;

public class CustomerDetailsService implements UserDetailsService{

	@Autowired
    private CustomerService customerService;
	UserDetails user = null;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = customerService.getCustomerByEmail(username);
		return new User(customer.getEmail(), customer.getPassword(),
                AuthorityUtils.createAuthorityList(customer.getRole()));
		
	}

}
