package com.curso.principal;

import java.util.List;

import com.curso.model.Departamento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejercicio06 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa");//persistence-unit del persistence.xml
		EntityManager em = emf.createEntityManager();
		
		//Selecciona los departamentos con menos de n empleados.
		TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d WHERE SIZE(d.empleados) < :numEmpleados", Departamento.class);
		consulta.setParameter("numEmpleados", 4);
		List<Departamento> lista = consulta.getResultList();
		
		for (Departamento item : lista) {
			System.out.println(item);
		}
	}
}
