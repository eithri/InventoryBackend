package com.guillermo.CRUD_PUXLES.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Producto {
	
	@Id
	private int id;
	
	private String name;
	private BigDecimal price;
	private int stock;
		
	public Producto() {
		super();
	}
	public Producto(int id, String name, BigDecimal price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
