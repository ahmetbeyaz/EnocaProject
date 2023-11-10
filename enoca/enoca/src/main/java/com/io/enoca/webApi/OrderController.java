package com.io.enoca.webApi;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.io.enoca.business.abstracts.OrderService;
import com.io.enoca.entities.Order;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
	
	
	@GetMapping("getAll")
	public List<Order>  getAll(){
		
		return orderService.getAll();
	}
	
	
	@PostMapping("add")
	public void add(@RequestBody()  Order order) {
		
		this.orderService.add(order);
	}
	
	@PutMapping("update")
	public void update(@RequestBody() Order order) {
		
		this.orderService.update(order);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		this.orderService.delete(id);
	}
	
	@GetMapping("/dateTime")
	public List<Order> getOrdersAfterDate(@RequestParam("date") @DateTimeFormat(pattern = "yyy-MM-dd") Date date)  {
		
		return this.orderService.getOrdersAfterDate(date);
	}
	

		
	

}
