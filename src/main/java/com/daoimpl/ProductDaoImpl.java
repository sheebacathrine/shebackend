package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.productdao;
import com.model.Product;
@Repository
public class ProductDaoImpl implements productdao {

	 @Autowired
	 private SessionFactory sessionFactory;
	 public void saveProduct(Product product) {
		   sessionFactory.getCurrentSession().save(product);
		 }
	
		}

