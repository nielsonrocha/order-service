package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PaymentMethod implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String description;
}
