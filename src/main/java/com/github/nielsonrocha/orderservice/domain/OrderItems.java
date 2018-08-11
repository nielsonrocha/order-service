package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderItems implements Serializable {

	private static final long serialVersionUID = 1L;

	private Product product;
	
	private Integer amount;
	
	private Double price;
	
	private Double sum;
}
