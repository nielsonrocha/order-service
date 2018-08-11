package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.springframework.data.annotation.Reference;

import lombok.Data;

@Data
@Entity
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	@Embedded
	private Customer customer;
	
	private Double totalDue;
	
	private Date date;
	
	private Double tax;
	
	@Embedded
	private List<Payment> payments;
	
	@Embedded
	private List<OrderItems> items;
	
	@Reference
	private ShippingMethod shippingMethod;
	
	private Double shippingCost;
}
