package com.example.demo;

public class ProductSale {
	private Long id;
	private String pname;
	private Double cost;
	private Integer qty;
	private String env;
	private Double total;
	
	public ProductSale() {
		super();
	}
	
	public ProductSale(Long id, String pname, Double cost, Integer qty, String env) {
		super();
		this.id = id;
		this.pname = pname;
		this.cost = cost;
		this.qty = qty;
		this.env = env;
		this.total = this.cost*this.qty;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public Double getTotal() {
		this.total=this.cost*this.qty;
		return total;
	}	
}
