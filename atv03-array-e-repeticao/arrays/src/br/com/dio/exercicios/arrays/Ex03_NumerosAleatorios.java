package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
e armazene-os em um vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex03_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random(); //Classe que gera números aleatórios.
		
		int[] numerosAleatorios = new int[20]; //Declaração do array com 20 posições.
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100); //Pegando um número aleatório entre 0 e 100.
			numerosAleatorios[i] = numero; //Atribuindo esse valor ao elemento.
		}
		
		System.out.print("Numeros aleatórios: ");
		for(int numero : numerosAleatorios ) { //Para cada numero dentro do array de números.
			System.out.print(numero + " ");
		}
		
		System.out.println("\n-------------------------------------------------"); //Pula linha.
		
		System.out.print("Números sucessores: ");
		for(int numero : numerosAleatorios ) {
			System.out.print((numero + 1) + " "); //Se adicione + 1 ao número e imprime esse novo valor.
		}
		
		System.out.println("\n-------------------------------------------------"); //Pula linha.
		
		System.out.print("Números antecessores: ");
		for(int numero : numerosAleatorios ) {
			System.out.print((numero - 1) + " "); //Subtrai 1 ao número aleatório e imprime esse novo valor.
		}
	}
}
