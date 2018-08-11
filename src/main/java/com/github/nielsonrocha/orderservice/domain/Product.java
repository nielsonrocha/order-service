package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String description;
	
}
