package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="product-service", url="localhost:8000")
@FeignClient(name="product-service")
public interface ProductServiceProxy {
	@GetMapping("/product-service/pname/{pname}/cost/{cost}/qty/{qty}")
public ProductSale getService(@PathVariable("pname") String pname,@PathVariable("cost") double cost,@PathVariable("qty") int qty) ;
	
}
