// 07)	Criar um programa preencha um vetor de inteiros de 10 posições, via teclado. 
//Após o preenchimento do vetor,o programa deverá verificar quais são os elementos 
	//ímpares e gerar um novo vetor com esses elementos. Por fim, o programa deverá 
	//exibir na tela os dois vetores.



package Exercício_07;

import java.util.Scanner;

public class Exercício_07 {

public static void main ( String[] args ) {
	Scanner leitor = new Scanner(System.in);
	
	int v[] = new int[10];
	
	//Preencher o vetor
	for (int i = 0; i < v.length; i++) {
		System.out.printf("Digite o %sº numero: ", (i + 1));
		v[i] = leitor.nextInt();
	}
	
	//Verificar quantos elementos ímpares existem
	int qtImpares = 0;
	for (int i = 0; i < v.length; i++) if (v[i] % 2 != 0) qtImpares++;
	
	
	//Cria e preenche um vetor com os elementos ímpares
	int impares[] = new int[qtImpares];
	int j = 0;
	for (int i = 0; i < v.length; i++) {
		if (v[i] % 2 != 0) {
			impares[j] = v[i];
			j++;
		}
	}
	
	//Impressão dos dois vetores
	for (int i = 0; i < v.length; i++) {
		if (i > 0) System.out.print(", ");
		System.out.print(v[i]);
	}
	
	System.out.println();
	
	for (int i = 0; i < impares.length; i++) {
		if (i > 0) System.out.print(", ");
		System.out.print(impares[i]);
	}
	
	leitor.close();
	
  }
}