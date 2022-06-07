package com.ty.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
	
	public class TestStudentCache {
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
			//Second   Level Cacheing
			
			Student student =entityManager.find(Student.class, 1);
			
			System.out.println(student);
			
			EntityManager entityManager1=entityManagerFactory.createEntityManager();

			Student student1 =entityManager.find(Student.class, 1);
			System.out.println(student1);
			Student student2 =entityManager.find(Student.class, 2);
			System.out.println(student2);
			entityManager.persist(student);
			
			
			
			
		}

}
