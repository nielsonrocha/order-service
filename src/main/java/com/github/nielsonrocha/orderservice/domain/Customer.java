package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private ObjectId id;
	
	private String name;
	
	private String nationalId;
	
	private String email;
	
	private String phone;
}
