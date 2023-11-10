package com.io.enoca.DataAccess;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.enoca.entities.Order;

public interface OrderRepositoy extends JpaRepository<Order, Integer> {
	
	List<Order> findByCreateDateAfter(Date date);
	
	

}
