package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que peça N números inteiros,
 calcule e mostre a quantidade de números pares
 e a quantidade de números impares.  
 */

public class Ex04_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado
		
		int quantNumeros;
		int numero;
		int quantPares = 0;
		int quantImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int contador = 0;
		do{
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			contador = contador + 1; //Soma +1 ao contador (contador++)
			
		}while(contador < quantNumeros);
		
		//Imprimindo a quantidade de números pares digtados e números ímpares digitados
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números ímpares: " + quantImpares);
	}
}
