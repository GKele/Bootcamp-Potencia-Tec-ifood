package me.dio.numeros.iguais.desafio;

import java.util.Scanner;

/*
 Nesse desafio, dados dois números, verifique se eles são iguais.
 Caso sejam, retorne "Sao iguais!”.
 Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
*/

public class NumerosIguais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A, B;
		
		A = scan.nextInt();		
		B = scan.nextInt();
		
		
		if (A == B) {
			System.out.print("São iguais!");
		}else {
			System.out.print("Não são iguais!");
		}

	}

}
