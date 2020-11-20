package com.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.collections.Estado;
import com.restapi.repositories.EstadoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	EstadoRepository er;
	
	@Override
	public Flux<Estado> findALL() {
		return er.findAll();
	}

	@Override
	public Mono<Estado> findById(String id) {
		return er.findById(id);
	}

	@Override
	public Mono<Estado> save(Estado estado) {
		return er.save(estado);
	}


}
