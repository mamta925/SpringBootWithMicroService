package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductSaleController {
	@Autowired Environment environment;
	@Autowired ProductServiceProxy proxy;
	private String env;
	@GetMapping("/product-sale/pname/{pname}/cost/{cost}/qty/{qty}")
	public ProductSale getSales(@PathVariable String pname,@PathVariable double cost,@PathVariable int qty) {
		env = environment.getProperty("local.server.port");
		HashMap<String,String> uriVariables= new HashMap<String, String>();
		uriVariables.put("pname", pname);
		uriVariables.put("cost", String.valueOf(cost));
		uriVariables.put("qty", String.valueOf(qty));
	//	ProductSale sales= new ProductSale(1001L, pname, cost, qty, env);
        ResponseEntity<ProductSale> responseEntity = new RestTemplate().getForEntity(
    			"http://localhost:8000/product-service/pname/{pname}/cost/{cost}/qty/{qty}", 
    			ProductSale.class,uriVariables);
		ProductSale sales=responseEntity.getBody();
        return new ProductSale(sales.getId(),sales.getPname(),sales.getCost(),sales.getQty(),sales.getEnv()+":Rest");
	}
	
	// for feign
	@GetMapping("/product-sale-feign/pname/{pname}/cost/{cost}/qty/{qty}")
	public ProductSale getSalesFeign(@PathVariable String pname,@PathVariable double cost,@PathVariable int qty) {
     ProductSale productSale= proxy.getService(pname, cost, qty);
	    return new ProductSale(productSale.getId(),productSale.getPname(),productSale.getCost(),productSale.getQty(),productSale.getEnv()+":Feign");
	}
}
