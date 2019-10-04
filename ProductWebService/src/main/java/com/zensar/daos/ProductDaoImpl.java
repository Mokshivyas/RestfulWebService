package com.zensar.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;
/**
 * @author Mokshi Vyas
 * @creation date: 04 oct 19 10.27 AM
 * @modification date: 04 Oct 19 
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is DAO class of product. it is used in persistence layer
 * 				
 *
 */
public class ProductDaoImpl implements ProductDao 
{
    private Session session;
    
    public ProductDaoImpl() 
    {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session= f.openSession();
		
	}
    
	@Override
	public List<Product> getAll() 
	{
	
		return session.createQuery("from Product").getResultList();
	}

	@Override
	public Product getById(int productId)
	{
		
		return session.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) 
	{
		Transaction t = session.beginTransaction();
		session.save(product);
		t.commit();

	}

	@Override
	public void update(Product product) 
	{
	
		Transaction t = session.beginTransaction();
		session.update(product);
		t.commit();

	}

	@Override
	public void delete(Product product)
	{
		
		Transaction t = session.beginTransaction();
		session.delete(product);
		t.commit();

	}

}
