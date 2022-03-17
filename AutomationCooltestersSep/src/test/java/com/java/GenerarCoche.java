package com.java;

public class GenerarCoche {

	public static void main(String[] args) {
		// Tesla
		Coche cocheTesla = new Coche("Tesla", "rojo", "2020", 4, 2, false);
		
		System.out.println("Mi coche Tesla es de color "+ cocheTesla.getColor());
		
		// Nissan
		Coche nissan = new Coche("Nissan", "Azul", "2019", 4, 4, false);
		System.out.println("Mi coche Nissan es de color "+ nissan.getColor());
		
		// Desconocido
		Coche coche = new Coche();

	}

}
