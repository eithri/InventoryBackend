package com.guillermo.CRUD_PUXLES.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guillermo.CRUD_PUXLES.model.Producto;
import com.guillermo.CRUD_PUXLES.service.api.ProductoServiceAPI;

@RestController
@RequestMapping("/producto/api/v1")
@CrossOrigin("*")
public class ProductoController {
	
	@Autowired
	private ProductoServiceAPI productoServiceAPI;

	@GetMapping(value = "/all")
	public List<Producto> getAll() {
		return productoServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Producto find(@PathVariable Integer id) {
		return productoServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Producto> save(@RequestBody @Validated Producto producto) {
		Producto obj = productoServiceAPI.save(producto);
		return new ResponseEntity<Producto>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Producto> delete(@PathVariable Integer id) {
		Producto producto = productoServiceAPI.get(id);
		if (producto != null) {
			productoServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Producto>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}

}
