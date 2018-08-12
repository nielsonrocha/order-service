package com.github.nielsonrocha.orderservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.github.nielsonrocha.orderservice.domain.PaymentMethod;

@RepositoryRestResource(collectionResourceRel = "payment-method", path = "payment-method")
public interface PaymentMethodRepository extends MongoRepository<PaymentMethod, String> {

	List<PaymentMethod> findByDescriptionIgnoreCaseContaining(@Param("description") String description);
}
