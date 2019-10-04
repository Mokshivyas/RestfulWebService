package com.zensar.restfull;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

/**
 * @author Mokshi Vyas
 * @creation date: 04 oct 19 2.07 PM
 * @modification date: 04 Oct 19 
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description This is product web service class
 * 				
 *
 */
@Path("/products")
public class ProductWebService{
	private ProductService productService;
	
	public ProductWebService() 
	{
	 productService = new ProductServiceImpl();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts()
	{
		return productService.findAllProducts();
	}
}
