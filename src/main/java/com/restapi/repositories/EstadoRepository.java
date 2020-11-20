package com.restapi.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.restapi.collections.Estado;

public interface EstadoRepository extends ReactiveMongoRepository<Estado, String> {

}
