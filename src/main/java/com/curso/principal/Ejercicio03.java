package com.curso.principal;

import com.curso.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ejercicio03 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa");
		EntityManager em = emf.createEntityManager();
		
		Empleado empleado1 = em.find(Empleado.class, 1);
		Empleado empleado2 = em.find(Empleado.class, 2);
		
		if (empleado1.getFecha().after(empleado2.getFecha())) {
			System.out.println(empleado1);
		} else {
			System.out.println(empleado2);
		}
	}
}
