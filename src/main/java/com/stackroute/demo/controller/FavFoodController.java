package com.stackroute.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1")
public class FavFoodController {

	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/list")
	public List<Object> getFoods()
	{
		String url="https://api.nal.usda.gov/fdc/v1/foods/list?api_key=mePgL9SZb9oVIiGtjvgbkRbojo1URDdNUbZcokuA";
		Object[] objects=restTemplate.getForObject(url, Object[].class);
	
		return Arrays.asList(objects[0]);
		
			
	}
	
}
