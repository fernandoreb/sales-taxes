package com.farg.sales.taxes.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private Float price;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_id", referencedColumnName = "id")
	private SaleTax saleTax;

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

	public SaleTax getSaleTax() {
		return saleTax;
	}

	public void setSaleTax(SaleTax saleTax) {
		this.saleTax = saleTax;
	}
		
}
