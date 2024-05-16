package com.curso.principal;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.curso.model.Departamento;
import com.curso.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ejercicio01 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa");
		EntityManager em = emf.createEntityManager();
		
		//La empresa está en proceso de expansión y necesita crear un departamento nuevo y asignar a dicho departamento tres nuevos empleados.
		em.getTransaction().begin();
		Departamento departamento = new Departamento("Desarrolladores Python", "Ourense");
		Empleado empleado1 = new Empleado("Naia", Date.valueOf("2015-5-15"), 2000, departamento);
		Empleado empleado2 = new Empleado("Pedra", Date.valueOf("2015-5-15"), 2000, departamento);
		Empleado empleado3 = new Empleado("Pepa", Date.valueOf("2015-5-15"), 2000, departamento);
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		departamento.setEmpleados(empleados);
		
		em.persist(departamento);
		em.persist(empleado1);
		em.persist(empleado2);
		em.persist(empleado3);
		
		em.getTransaction().commit();
	}
}
