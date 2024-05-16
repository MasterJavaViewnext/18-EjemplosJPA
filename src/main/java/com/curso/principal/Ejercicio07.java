package com.curso.principal;

import java.util.List;

import com.curso.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejercicio07 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa");//persistence-unit del persistence.xml
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Empleado> consulta = em.createQuery("SELECT e FROM Empleado e WHERE e.sueldo < (SELECT avg(p.sueldo) FROM Empleado p)", Empleado.class);
		List<Empleado> lista = consulta.getResultList();
		
		for (Empleado item : lista) {
			System.out.println(item);
		}
	}
}
