package Exercício_02;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
         // 02) Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um 
		// programa que efetua a soma dos valores e imprima o resultado.
		
		int somatotal = 0;
		
		int Soma[] = {5,10,8,4,9,16,28,40,80,10};
		
		// int somatotal = Soma[0]+Soma[1]+Soma[2]+Soma[3]+Soma[4]+Soma[5]+Soma[6]+Soma[7]+Soma[8]+Soma[9];

		//System.out.println(" A soma dos números do vetor é " + somatotal);
		
		
		for (int i = 0; i < 10; i++) {
			 somatotal = somatotal + Soma[i];
						
		}
		
		System.out.println(" A soma do vetor é :" + somatotal);
	
	leitor.close();
	}

}
