package com.io.enoca.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.enoca.DataAccess.OrderRepositoy;
import com.io.enoca.business.abstracts.OrderService;
import com.io.enoca.entities.Order;

@Service
public class OrderManager implements OrderService {
	
	
	@Autowired
	private OrderRepositoy orderRepositoy;

	@Override
	public List<Order> getAll() {
		
		return this.orderRepositoy.findAll();
	}

	@Override
	public void add(Order order) {
		this.orderRepositoy.save(order);
		
	}

	@Override
	public void update(Order order) {
         this.orderRepositoy.save(order);		
	}

	@Override
	public void delete(int id) {
		this.orderRepositoy.deleteById(id);
		
	}
	
	public List<Order>  getOrdersAfterDate(Date date){
		return orderRepositoy.findByCreateDateAfter(date);
	}
	
		
		
	

}
