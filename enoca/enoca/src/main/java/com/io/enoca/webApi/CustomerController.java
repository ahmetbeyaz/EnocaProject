package com.io.enoca.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.enoca.business.abstracts.CustomerService;
import com.io.enoca.entities.Customer;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@GetMapping("/getAll")
	public List<Customer>  getAll(){
		
		return this.customerService.getAll();
	}
	
	
	@PostMapping("/add")
	public  void add( @RequestBody() Customer customer) {
		
	this.customerService.add(customer);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody()  Customer customer) {
		
		this.customerService.add(customer);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable() int id) {
		
		this.customerService.delete(id);
	}
	
	
	@GetMapping("/{id}")
	public Customer  getById(@PathVariable()  int id){
		
		return	this.customerService.getById(id);
	}
	
		
	
	@GetMapping("/withoutOrders")
	public List<Customer> getCustomersWithoutOrders(){
		
		return this.customerService.getCustomersWithoutOrders();
	}
	
	
	@GetMapping("/CustomerAndOrderId")
	public List<Object[]> getCustomerAndOrderIdsByKeyword( String keyword) {
		
		return this.customerService.getCustomerAndOrderIdsByKeyword(keyword);
	}

    
	
}
