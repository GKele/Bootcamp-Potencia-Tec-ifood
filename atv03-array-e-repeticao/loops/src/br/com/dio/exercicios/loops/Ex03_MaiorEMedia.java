package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que leia 5 números e informe o maior número
 e a média entre esses números.
*/

public class Ex03_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero;
		double maior = 0; //guarda o maior numero
		double soma = 0;
		
		int contador = 0;
		
		do{
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) {
				maior = numero; //guarda o maior numero informado/digitado
			}
			
			contador +=  1; //contador = contador + 1
			//System.out.println("Maior número: " + maior); //A cada número digitado informa o maior		
		
		}while(contador < 5);
		
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + soma/5);
	}
}
