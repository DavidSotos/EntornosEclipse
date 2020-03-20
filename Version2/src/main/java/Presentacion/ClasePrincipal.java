package main.java.Presentacion;

import main.java.Dominio.Estudiante;
import main.java.Dominio.Persona;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1= new Persona("David","Sotos",22);
		Persona p2= new Estudiante("Mario","Marugan",25,3000);
		System.out.println(p1.toString());
		System.out.println(((Estudiante)p2).getBeca());
	}

}
