package Exercício_03;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);

// 03)	Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, 
		// criar umprograma que efetua a média dos valores e imprima o resultado.		
		
		double[] v = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		double soma_vetor = 0;
		double media_vetor;
		
		for ( int i = 0; i < 10; i++) {
		
		soma_vetor = soma_vetor + v[i];
		}
		media_vetor= soma_vetor / 10;
	System.out.printf(" A média do vetor é %.2f: " , media_vetor);
	
		
			
		leitor.close();
	}

}
