package com.stackroute.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class FavFood {

	@Id
	public String foodId;
	public String foodCode;
	public String description;
	public List<Nutrients> nutrients;
	public FavFood()
	{
		
	}
	
	
	
	public FavFood(String foodId, String foodCode, List<Nutrients> nutrients) {
		super();
		this.foodId = foodId;
		this.foodCode = foodCode;
		this.nutrients = nutrients;
	}



	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public List<Nutrients> getNutrients() {
		return nutrients;
	}
	public void setNutrients(List<Nutrients> nutrients) {
		this.nutrients = nutrients;
	}



	@Override
	public String toString() {
		return "FavFood [foodId=" + foodId + ", foodCode=" + foodCode + ", nutrients=" + nutrients + "]";
	}
	
	
	
	
}
