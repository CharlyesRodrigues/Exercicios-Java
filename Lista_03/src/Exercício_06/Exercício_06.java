package Exerc�cio_06;

import java.util.Scanner;

public class Exerc�cio_06 {

	public static void main(String[] args) {

    Scanner leitor = new Scanner (System.in);

  //06)	Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, 
  //criar um programa que leia um n�mero e informe na tela quantas vezes este n�mero 
    //foi encontrado no vetor.    
 
   
   int[] v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
  int cont = 0;
   System.out.println( "Digite um n�mero");
     int x = leitor.nextInt();
   
   for( int i = 0; i < v.length ; i++) {
		   
	 
	 
	   if( v[i] == x ) {
		
		
		 
		   cont = cont +1;
		
	   }	
   }
		
		
		
		System.out.printf(" O n�mero %d foi encontrado %d vezes",x,cont );
	

	 		     
		leitor.close(); 
	 
   
   
     
	
}
	}
