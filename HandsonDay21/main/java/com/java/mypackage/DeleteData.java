package com.java.mypackage;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DeleteData {

	public static void main(String[] args) {
		
		// Create typesafe ServiceRegistry object

				StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

				Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

				SessionFactory factory = meta.getSessionFactoryBuilder().build();

				Session session = factory.openSession();

				Transaction t = session.beginTransaction();

				Query query = session.createQuery("delete from Employee where eid=:n");// here persistent class
																										// name is Emp
				query.setParameter("n", 103);

				int status=query.executeUpdate();
				
				t.commit();
				
				System.out.println("successfully deleted " + status);

				factory.close();

				session.close();

	}

}
