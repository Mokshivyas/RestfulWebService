package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Mokshi Vyas
 * @creation date: 04 oct 19 10.11 AM
 * @modification date: 04 Oct 19 
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is DAO interface for product.
 * 				It is used in persistence layer.
 *
 */
public interface ProductDao 
{

	List<Product> getAll();
	
	Product getById(int productId);
	
	void insert(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
}
