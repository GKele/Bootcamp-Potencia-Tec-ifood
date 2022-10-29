package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
*/

public class Ex04_ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random(); //Classe para gerar números aleatórios.
		
		//Linhas x colunas
		int[][] M = new int[4][4]; //Declaração de uma matriz multidimensional.
		

		for(int i = 0; i < M.length; i++) {//Navegando na matriz.
			
			//Navegando na linha
			for(int j = 0; j < M[i].length; j++) { //Para a variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
				M[i][j] = random.nextInt(9); //Atribuindo um número aleatóriamente a posição do elemento.
			}
		}
		
		System.out.println("Matriz: ");
		for(int[] linha : M) { //Para cada linha da matriz M
			for(int coluna : linha) { //Pegue a coluna desta linha
				System.out.print(coluna + " "); //Imprima esta coluna
			}
			System.out.println(); //Pular uma linha (sem deixar espaço).
		}
	}
}
