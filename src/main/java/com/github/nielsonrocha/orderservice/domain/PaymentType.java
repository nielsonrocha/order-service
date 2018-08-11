package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import lombok.Data;

@Data
@Entity
public class PaymentType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	private String description;
}
