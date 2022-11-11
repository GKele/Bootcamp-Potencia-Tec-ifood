package me.digitalInovation.OO;

import java.util.Scanner;

/*
 Neste desafio, receba um número inteiro N,
 calcule e imprima o somatório de todos os números de N até 0.   
*/
public class ChamadaRecursiva {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N, somatorio = 0;
		
		//System.out.println("Digite um número: ");
		N = scan.nextInt();
		
		for(int i = 0; i < N; N--) {
			if(N > 0) {
				somatorio = somatorio + N;
			}
		}
		System.out.print(somatorio);
	}

}
