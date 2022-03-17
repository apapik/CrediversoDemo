package com.java;

public class Ciclos {

	public static void main(String[] args) {
		// while
		
		int numero = 1;
		
		while(numero <= 1) {
			System.out.println("El numero es: "+ numero);
			numero++;
			break;
		}
		
		// do while - Cuantas veces se tiene que sumar un numero a si mismo para llegar a 100?
		
		int numeroSum = 5;
		int sumTotal = 0;
		int count = 0;
		
//		do {
//			sumTotal = sumTotal + numeroSum;// Que voy a hacer?
//			count++;
//		}while(sumTotal<100);//mientras sea true
//		
//		System.out.println("El numero se sumo "+ count);

		while(sumTotal<100) {
			sumTotal = sumTotal +  numeroSum;
			count++;
			
		}System.out.println("El numero se sumo "+ count);
		
		//For contador hasta 10
		System.out.println("##########");
		for(int i=0; i<numero ; i++) {
			//Block Code
			System.out.println("El numero es "+ i);
		}
	}
	
	

}
