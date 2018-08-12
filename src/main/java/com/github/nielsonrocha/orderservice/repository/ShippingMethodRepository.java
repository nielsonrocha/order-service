package com.github.nielsonrocha.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.github.nielsonrocha.orderservice.domain.ShippingMethod;


@RepositoryRestResource(collectionResourceRel = "shipping-method", path = "shipping-method")
public interface ShippingMethodRepository extends MongoRepository<ShippingMethod, String> {

}
