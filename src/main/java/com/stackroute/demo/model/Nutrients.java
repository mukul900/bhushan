package com.stackroute.demo.model;

public class Nutrients {
	public String name;
	public String id;
	public String amount;
	public Nutrients()
	{
		
	}
	public Nutrients(String name, String id, String amount) {
		super();
		this.name = name;
		this.id = id;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Nutrients [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
	
	
	
	

}
