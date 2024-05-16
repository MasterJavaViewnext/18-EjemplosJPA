package com.curso.model;

import java.util.Comparator;

public class EmpleadoAntiguoComparator implements Comparator<Empleado> {

	public int compare(Empleado o1, Empleado o2) {
		return o1.getFecha().compareTo(o2.getFecha());
	}

}
