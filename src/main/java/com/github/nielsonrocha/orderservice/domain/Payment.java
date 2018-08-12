package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Reference;

import lombok.Data;

@Data
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Reference
	private PaymentMethod paymentType;
	
	private Double value;
}
