package com.farg.sales.taxes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farg.sales.taxes.model.Product;
import com.farg.sales.taxes.model.SaleTax;
import com.farg.sales.taxes.service.ProductService;
import com.farg.sales.taxes.service.SaleTaxService;

@RestController
@RequestMapping(path = "/sales")
public class SalesTaxesController {

	@Autowired
	private ProductService productService;

	@Autowired
	private SaleTaxService saleTaxService;

	@GetMapping(path = "/v1/product")
	public @ResponseBody Iterable<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping(path = "/v1/product") // Map ONLY POST Requests
	public @ResponseBody String addNewProduct(@RequestParam String name, @RequestParam Float price,
			@RequestParam Integer taxType) {

		Product p = new Product();
		p.setName(name);
		p.setPrice(price);

		Optional<SaleTax> saleTax = saleTaxService.getSaleTaxById(taxType);

		p.setSaleTax(saleTax.get());
		productService.save(p);
		return "Saved";
	}
	
	@GetMapping(path="/v1/tax")
	public @ResponseBody Iterable<SaleTax>getAllTaxes(){
		return saleTaxService.getAllProducts();
	}
	
	@PostMapping(path = "/v1/tax") // Map ONLY POST Requests
	public @ResponseBody String addNewTax(@RequestParam String label, @RequestParam Integer percent) {

		SaleTax saleTax = new SaleTax();
		saleTax.setLabel(label);
		saleTax.setPercent(percent);
		saleTaxService.save(saleTax);
		
		return "Saved";
	}

}
