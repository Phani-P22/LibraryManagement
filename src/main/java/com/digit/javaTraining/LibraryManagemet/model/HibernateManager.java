package com.digit.javaTraining.LibraryManagemet.model;

import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Iterator;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mysql.cj.Query;

public class HibernateManager 
{
	public Session session;
    public HibernateManager() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
        session = sessionFactory.openSession();
        System.out.println("Connected to Pf...");
    }
    
	public boolean saveobj(User u)
	{
		org.hibernate.Transaction trn =session.beginTransaction();
        Serializable save = session.save(u);
        trn.commit();
        System.out.println("Object Saved!");

        if(save==null) 
        {

            return false;
        }
        return true;
	}

	public boolean login(int uid,String pwd) 
	{
		   org.hibernate.Query q=session.createQuery("from User where uid=:uid and pwd=:pwd");
		   q.setParameter("uid",uid);
		   q.setParameter("pwd",pwd);
		  	System.out.println("Name update succes");
		  	Iterator itr = q.iterate();
		  	if(itr.hasNext())
		  	{
		  		return true;
		  	}
		  	else
		  	{
				// trn.commit();
				 return false;
		  	}
	}

	public boolean saveobjbook(Book  b) {
		
        Serializable save = session.save(b);
        //trn.commit();
        System.out.println("Object Saved!");

        if(save==null) 
        {

            return false;
        }
		
		return true;
	}	
	}
