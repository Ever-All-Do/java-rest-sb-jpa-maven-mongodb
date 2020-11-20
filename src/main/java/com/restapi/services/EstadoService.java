package com.restapi.services;

import com.restapi.collections.Estado;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EstadoService {

	Flux<Estado> findALL();
	Mono<Estado> findById(String id);
	Mono<Estado> save(Estado estado);

	
}
