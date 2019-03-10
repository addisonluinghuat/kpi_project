package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

public class Product {

	@ApiModelProperty(notes = "Product name")
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
