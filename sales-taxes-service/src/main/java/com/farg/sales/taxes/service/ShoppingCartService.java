package com.farg.sales.taxes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farg.sales.taxes.model.ShoppingCart;
import com.farg.sales.taxes.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	public Iterable<ShoppingCart>getAllCarts(){
		return shoppingCartRepository.findAll();
	}
	
	public ShoppingCart save(ShoppingCart shoppingCart) {
		return shoppingCartRepository.save(shoppingCart);
	}
	
	public Optional<ShoppingCart> getCartById(Integer id) {
		return shoppingCartRepository.findById(id);
	}
}
