package com.ty.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Student student =new Student();
		student.setName("tejas");
		student.setEmail("tejas@gmail.com");
		entityTransaction.begin();
		
		entityManager.persist(student);
		
		entityTransaction.commit();
	}
}
