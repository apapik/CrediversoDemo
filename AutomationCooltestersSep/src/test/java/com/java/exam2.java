package com.java;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String constantes1 = "abcabc";
		//String constantes2 = "cccc";

	
			constantes1.replace("bc", "a");
			System.out.println("El valor es "+ constantes1.length);
		

	}

}


function StringReduction(str) { 

	  // code goes here
	  String constantes1 = "abcabc";
	  String constantes2 = "cccc";

	  do{
	    constantes1.replace("ca","c");
	  }
	  
	  while(constantes1 != "aa"){
	    constantes1.replace("ca","c");
	  }
	  System.out.println("The result is" + constantes1.length);

	  
	  System.out.println("The result is" + constantes2.length);



	  return str; 

	}