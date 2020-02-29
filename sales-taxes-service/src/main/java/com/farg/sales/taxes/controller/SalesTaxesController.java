package com.farg.sales.taxes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farg.sales.taxes.model.Product;
import com.farg.sales.taxes.repository.ProductRepository;
import com.farg.sales.taxes.service.ProductService;

@RestController 
@RequestMapping(path="/sales")
public class SalesTaxesController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(path="/product")
	public @ResponseBody Iterable<Product>getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping(path="/product") // Map ONLY POST Requests
	  public @ResponseBody String addNewProduct (@RequestParam String name
	      , @RequestParam Float price, @RequestParam Integer type) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Product p = new Product();
	    p.setName(name);
	    p.setPrice(price);
	    p.setType(type);
	    productService.save(p);
	    return "Saved";
	  }

}
