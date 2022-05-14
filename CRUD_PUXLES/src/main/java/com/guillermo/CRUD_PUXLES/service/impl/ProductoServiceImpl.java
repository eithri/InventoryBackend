package com.guillermo.CRUD_PUXLES.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.guillermo.CRUD_PUXLES.commons.GenericServiceImpl;
import com.guillermo.CRUD_PUXLES.dao.api.ProductoRepository;
import com.guillermo.CRUD_PUXLES.model.Producto;
import com.guillermo.CRUD_PUXLES.service.api.ProductoServiceAPI;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoServiceAPI {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public CrudRepository<Producto, Integer> getDao() {
		return productoRepository;
	}
	
}
