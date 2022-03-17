package com.herencia;

public class Main {

	public static void main(String[] args) {
		
		Padre nicolas = new Padre();
		
		System.out.println("Nicolas tiene ojos de color: " + nicolas.colorOjos());
		
		Hijo arturo = new Hijo();
		System.out.println("Arturo tiene ojos de color: " + arturo.colorOjos());;

	}

}
