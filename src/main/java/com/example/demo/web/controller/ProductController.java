package com.example.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ProductController {
  
	    @Value("${path.name}")
	    private String pathName;
	    

	    
	    
	    @ApiOperation(value = "Get a list of products",response = Product.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Ok, baby"),
	            @ApiResponse(code = 401, message = "This is not ok, baby")
	    })
	    @RequestMapping(value="/list",method=RequestMethod.GET,produces="application/json")
	    public List<Product> getProductList() {
	              List<Product> productList=new ArrayList<>();
	              Product product=new Product();
	              product.setName("Product 1");
	              product.setDescription("product description "+pathName);
	              productList.add(product);
	    	return productList;
	    }
}
