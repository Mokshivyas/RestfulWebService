package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

public class ProductServiceImpl implements ProductService 
{
	
	private ProductDao productDao;


	public ProductServiceImpl() 
	{
	 	productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAllProducts() 
	{
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) 
	{
		Product product= productDao.getById(productId);
		return product;
	}

	@Override
	public void addProduct(Product product) 
	{
		productDao.insert(product);

	}

	@Override
	public void updateProduct(Product product)
	{
		productDao.update(product);

	}

	@Override
	public void removeProduct(Product product)
	{
		productDao.delete(product);

	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) 
	{
		float price;
		List<Product> product =productDao.getAll();
		List<Product> range = new ArrayList<Product>();
		for(Product p:product) 
		{
			if(p.getPrice() >= minPrice && p.getPrice()<= maxPrice) 
			{
				range.add(p);
			}
		}
		
		return range;
	}

	@Override
	public List<Product> findProductByname(String productName) {
		List<Product> product =productDao.getAll();
		List<Product> pr = new ArrayList<Product>();
		for(Product p: product)
		{
			if(p.getName().equals(productName))
			{
				pr.add(p);
			}
		}
		return pr;
	}

	@Override
	public List<Product> findProductByBrand(String productBrand) {
		List<Product> product =productDao.getAll();
		List<Product> pb = new ArrayList<Product>();
		for(Product p: product)
		{
			if(p.getBrand().equals(productBrand))
			{
				pb.add(p);
			}
		}
		return pb;
	}

	@Override
	public long getProductCount() 
	{
		
		List<Product> product =productDao.getAll();
		int count = product.size();
		return  count;
	}

}
