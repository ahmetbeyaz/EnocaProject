package com.io.enoca.business.abstracts;

import java.util.List;

import com.io.enoca.entities.Customer;

public interface CustomerService {
	
	List<Customer>  getAll();
		
	List<Customer> getCustomersWithoutOrders();
		
	List<Object[]> getCustomerAndOrderIdsByKeyword(String keyword);
	
	void add(Customer customer);
	
	void update(Customer customer);
	
	void delete(int id);
	
	Customer  getById(int id);

}
