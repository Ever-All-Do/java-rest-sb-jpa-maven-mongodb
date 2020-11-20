package com.restapi.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Estado")
public class Estado {
	
	@Id
	private String id;
	private String uf;
	private String nome;
	
	//public Estado() {}

	public String getId() {
		return id;
	}


	public Estado(String id, String uf, String nome) {
		super();
		this.id = id;
		this.uf = uf;
		this.nome = nome;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
