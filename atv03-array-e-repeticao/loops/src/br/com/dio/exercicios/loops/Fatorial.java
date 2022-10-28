package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um numero
inteiro fornecido pelo usuário.
Ex: 5! = 120 
*/

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número: ");
		//Utilizei long pois a partir de 13! o int não consegue suportar o resultado.
		long fatorial = scan.nextLong();
		
		long multiplicacao = 1;
		
		//Para a variável i = numero, até i maior ou igual a 1, diminuimos 1 ao valor de i a cada loop.
		for(long i = fatorial; i >= 1 ; i-- ) { //i= i -1
			multiplicacao = multiplicacao * i; //Multiplica-se os valores de i e armaze-se na variável multiplicação
		}
		
		System.out.println("Fatorial: " + fatorial + "! = " + multiplicacao);
	}
}
