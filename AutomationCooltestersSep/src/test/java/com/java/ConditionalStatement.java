package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// Ejercicio limite de velocidad

		int velocidad = 90; // km por hora
		int limitevelocidad = 80; // km por hora
		boolean carretera = false;

		if (carretera == true) {
			limitevelocidad = 110;

			if (velocidad > limitevelocidad) {
				System.out.println("MULTA");
			} else {
				System.out.println("PREMIO");
			}
		} else if (velocidad > limitevelocidad) {
			System.out.println("MULTA");
		} else {
			System.out.println("PREMIO");
		}

	}

}
