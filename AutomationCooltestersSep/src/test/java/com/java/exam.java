package com.java;

import java.util.Arrays;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numeros1 = {2,2,2,2,4,1};
		  int[] numeros2 = {1,1,2,10,3,1,12};

		  int sumNumeros1 = Arrays.stream(numeros1).sum();
		  System.out.println("The sum is "+ sumNumeros1);

		  int multNumeros1 = numeros1[3] * numeros1[4];
		  System.out.println("The mult is "+ multNumeros1);

		  int sumNumeros2 = Arrays.stream(numeros1).sum();
		  System.out.println("The sum is "+ sumNumeros2);

		  int multNumeros2 = numeros2[3] * numeros2[6];
		  System.out.println("The mult is "+ multNumeros1);

		  if (sumNumeros1 > multNumeros1){
			    System.out.println("false");

			  }else {
			    System.out.println("true");
			  }
			   
			   
			  if (sumNumeros2 < multNumeros2){
			    System.out.println("true");

			  }else {
			    System.out.println("false");
			  }

	}

}
