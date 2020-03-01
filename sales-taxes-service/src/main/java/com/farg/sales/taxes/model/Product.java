package com.farg.sales.taxes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private Float price;
	
	@ManyToMany
	private List<SaleTax> saleTaxes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<SaleTax> getSaleTaxes() {
		return saleTaxes;
	}

	public void setSaleTaxes(List<SaleTax> saleTaxes) {
		this.saleTaxes = saleTaxes;
	}
		
}
