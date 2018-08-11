package com.github.nielsonrocha.orderservice.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import lombok.Data;

@Entity
@Data
public class ShippingMethod implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	private String description;
}
