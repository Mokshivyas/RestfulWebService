package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Mokshi Vyas
 * @creation date: 04 oct 19 11.42 AM
 * @modification date: 04 Oct 19 
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description service layer of product used in business layer
 * 				
 *
 */
public interface ProductService 
{
	List<Product> findAllProducts();
	
	Product findProductById(int productId);
	
	void addProduct(Product product);
	
	void updateProduct(Product product);
	
	void removeProduct(Product product);
	
	List<Product> findProductsByPriceRange(float minPrice, float maxPrice);
	
	List<Product> findProductByname(String productName);
	
	List<Product> findProductByBrand(String productBrand);
	
	long getProductCount();
}
