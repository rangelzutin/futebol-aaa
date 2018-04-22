package br.com.aaa.futebol.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("futeboldb-unit");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void fechaFabrica() {
		emf.close();
	}
}