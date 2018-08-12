package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Customer customer;
	
	private Double totalDue;
	
	private Date date;
	
	private Double tax;
	
	private List<Payment> payments;
	
	private List<OrderItems> items;
	
	private ShippingMethod shippingMethod;
	
	private Double shippingCost;
}
