package com.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.userdao;
import com.model.User;
@Repository
@Transactional
public class userDaoImpl implements userdao {
@Autowired
SessionFactory sessionFactory; 

		public void saveUser(User user)
		{
			sessionFactory.getCurrentSession().save(user);
			
		}

	}


