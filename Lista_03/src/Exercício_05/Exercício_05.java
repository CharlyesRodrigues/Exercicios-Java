package Exerc�cio_05;

import java.util.Scanner;

public class Exerc�cio_05 {

	

	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
	
// 05)	Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, 
//criar um programa a que receba um n�mero pelo teclado, verifique e imprima na 
		// tela se este n�mero existe no vetor.		
		
		int v []= {91,10,50,89,45,80,2,45,3,105,95,13,26,49,50 };
		
			
	
		System.out.print(" Digite um n�mero :");
		int x = leitor.nextInt();
		
		
		boolean teste = false;
		
		for( int i = 0; i < v.length ; i++) {
					
			if ( x == v[i] ) {
		
				teste = true;
				
			}
	}
		
        if(teste == true) {
	  	  		
		 System.out.printf(" \n Esse n�mero  existe no vetor - "); 
	}else {
		
		System.out.printf(" \n Esse n�mero n�o existe no vetor - "); 

		}
	
	//leitor.close();
	}
	
	
}