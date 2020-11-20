package com.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.collections.Estado;
import com.restapi.services.EstadoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/estado")
public class EstadoController {

	@Autowired
	EstadoService es;
	
	@GetMapping
	public Flux<Estado> getEstado(){
		return es.findALL();
	}
	
	@GetMapping(value = "/{id}")
	public Mono<Estado> getEstadoId(@PathVariable String id){
		return es.findById(id);
	}
	
	@PostMapping
	public Mono<Estado> save(@RequestBody Estado estado){
		return es.save(estado);
	}
	
}

