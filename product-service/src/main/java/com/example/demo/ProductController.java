package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
@Autowired Environment environment;
	@GetMapping("/product-service/pname/{pname}/cost/{cost}/qty/{qty}")
	public ProductService loadProdct(@PathVariable String pname,@PathVariable double cost,@PathVariable int qty) {
		ProductService product= new ProductService(1001L, pname, cost, qty);
		String env= environment.getProperty("local.server.port");
		product.setEnv(env+":: Current Instance");
		return product;
	}
}
