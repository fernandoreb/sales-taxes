package com.farg.sales.taxes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farg.sales.taxes.model.Product;
import com.farg.sales.taxes.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product>getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public Optional<Product> getProductById(Integer id) {
		return productRepository.findById(id);
	}
}
