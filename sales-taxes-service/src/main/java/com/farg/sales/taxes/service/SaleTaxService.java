package com.farg.sales.taxes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farg.sales.taxes.model.Product;
import com.farg.sales.taxes.model.SaleTax;
import com.farg.sales.taxes.repository.SaleTaxRepository;

@Service
public class SaleTaxService {

	@Autowired
	private SaleTaxRepository saleTaxRepository;
	
	public Optional<SaleTax> getSaleTaxById(Integer id) {
		return saleTaxRepository.findById(id);
	}
	
	public Iterable<SaleTax>getAllProducts(){
		return saleTaxRepository.findAll();
	}
	
	public void save(SaleTax saleTax) {
		saleTaxRepository.save(saleTax);
	}
}
