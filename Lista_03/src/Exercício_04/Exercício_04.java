package Exerc�cio_04;



public class Exerc�cio_04 {

	public static void main(String[] args) {
	
		
		
// 04) Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este conjunto
//acompanhado do seu elemento sim�trico em rela��o a sua posi��o no conjunto, ou seja, 
// a impress�o ser�: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5 - 6, 6 - 5, 7 - 4, 8 - 3, 9 - 2, 10 - 1.		
		
	int  v[] = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10 };
	
	
	 
	for ( int i = 0; i < v.length; i++) {
	     
		
		
		
			System.out.printf("%d - %d , ",v[i] , v.length - i);	
		 
		 
	 }
	
		
		
	
		
	

	
	}
}
