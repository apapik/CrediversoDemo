package com.java;

import org.apache.poi.util.SystemOutLogger;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short var1 = 130;
		short var2 = 20;
		
		int var3 = 1000;
		System.out.println("El valor: "+var3);
		
		var3 = 50;
		System.out.println("El valor: "+var3);
		
		double var4 = 2.24;
		System.out.println("La puerta mide "+var4+" mts");
		
		char letra;
		letra = '\u00A9';
		System.out.println(letra);
		
		String var5 = "Hola";
		String var6 = "a todos!!!";
		
		System.out.println(var5+var6+letra);
		
		boolean isDog = true;
		
		// Operadores Aritmeticos
		
		int x = 6;
		int y = 4;
		
		int suma = x / y;
		System.out.println("Esta es la suma: "+suma);
		
		// operadores Unarios -- agrega un valor adicional
		
		int a = 3;
		a++;
		a++;
		--a;
		
		System.out.println(a);
		
		if(!isDog) {
			
		}
		
		//Relacionados
		
		int var10 = 8;
		int var11 = 6;
		
		if(var10>var11) {
			System.out.println("BLOCK CODE");
		}
		
		//Operadores Condicionales
		
		int var12 = 8;
		int var13 = 6;
		
		if(var10>var11 && isDog) {
			System.out.println("BLOCK CODE");
		}
		
		//Condicionales
		
		

	}

}
