// 07)	Criar um programa preencha um vetor de inteiros de 10 posi��es, via teclado. 
//Ap�s o preenchimento do vetor,o programa dever� verificar quais s�o os elementos 
	//�mpares e gerar um novo vetor com esses elementos. Por fim, o programa dever� 
	//exibir na tela os dois vetores.



package Exerc�cio_07;

import java.util.Scanner;

public class Exerc�cio_07 {

public static void main ( String[] args ) {
	Scanner leitor = new Scanner(System.in);
	
	int v[] = new int[10];
	
	//Preencher o vetor
	for (int i = 0; i < v.length; i++) {
		System.out.printf("Digite o %s� numero: ", (i + 1));
		v[i] = leitor.nextInt();
	}
	
	//Verificar quantos elementos �mpares existem
	int qtImpares = 0;
	for (int i = 0; i < v.length; i++) if (v[i] % 2 != 0) qtImpares++;
	
	
	//Cria e preenche um vetor com os elementos �mpares
	int impares[] = new int[qtImpares];
	int j = 0;
	for (int i = 0; i < v.length; i++) {
		if (v[i] % 2 != 0) {
			impares[j] = v[i];
			j++;
		}
	}
	
	//Impress�o dos dois vetores
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