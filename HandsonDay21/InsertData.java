
package com.java.mypackage;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class InsertData {

	
public static void main(String[] args) {

  //Create typesafe ServiceRegistry object

  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

SessionFactory factory = meta.getSessionFactoryBuilder().build();

Session session = factory.openSession();

Transaction t = session.beginTransaction();

  Employee e1=new Employee();

  e1.setEid(103);

  e1.setEname("swamy");

  e1.setSal(2000);

  session.save(e1);

  t.commit();

  System.out.println("successfully saved");

  factory.close();

  session.close();

}

}


