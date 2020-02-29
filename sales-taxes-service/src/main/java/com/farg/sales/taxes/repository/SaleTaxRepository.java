package com.farg.sales.taxes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.farg.sales.taxes.model.SaleTax;

@Repository
public interface SaleTaxRepository extends CrudRepository<SaleTax, Integer> {

}
