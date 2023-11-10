package com.io.enoca.business.abstracts;

import java.util.Date;
import java.util.List;

import com.io.enoca.entities.Order;

public interface OrderService {
	
	List<Order>  getAll();
	
	List<Order>  getOrdersAfterDate(Date date);
	
	
	void add(Order order);
	void update(Order order);
	void delete(int id);
	
	

}
