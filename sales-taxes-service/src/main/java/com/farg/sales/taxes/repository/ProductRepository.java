package com.farg.sales.taxes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.farg.sales.taxes.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
