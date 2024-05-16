package com.curso.principal;

import java.sql.Date;

import com.curso.model.Departamento;
import com.curso.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ejercicio02 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Departamento departamento = em.find(Departamento.class, "2");
		Empleado empleado = new Empleado("Nuevo pedro", Date.valueOf("2015-5-15"), 2000, departamento);
		em.persist(empleado);
		em.getTransaction().commit();
	}
}
