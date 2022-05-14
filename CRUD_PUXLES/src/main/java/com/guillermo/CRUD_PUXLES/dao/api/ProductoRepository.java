package com.guillermo.CRUD_PUXLES.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guillermo.CRUD_PUXLES.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Integer>{
	
}
