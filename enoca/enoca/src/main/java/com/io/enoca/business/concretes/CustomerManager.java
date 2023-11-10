package com.io.enoca.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.enoca.DataAccess.CustomerRepository;
import com.io.enoca.business.abstracts.CustomerService;
import com.io.enoca.entities.Customer;


@Service
public class CustomerManager implements CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	
	@Override
	public List<Customer> getAll() {
		
		return customerRepository.findAll();
	}

	@Override
	public void add(Customer customer) {
		this.customerRepository.save(customer);
		
		
	}

	@Override
	public void update(Customer customer) {
		this.customerRepository.save(customer);
		
	}

	@Override
	public void delete(int id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer getById(int id) {
		
		return this.customerRepository.findById(id);
	}

	

	@Override
	public List<Customer> getCustomersWithoutOrders() {
		return this.customerRepository.findByOrdersIsNull();
	}

	

	@Override
	public List<Object[]> getCustomerAndOrderIdsByKeyword(String keyword) {

	
				return this.customerRepository.findCustomerAndOrderIdsByKeyword(keyword);
				
			}
		
		

	
	}



