package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
*/

public class Ex02_Consoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6]; //Iniciando um arrays vazio com 6 posições.
		int quantConsoantes = 0;
		
		int count = 0;
		//Loop
		do {
			System.out.print("Digite uma letra: ");
			String letra = scan.next();
			
			//Se a letra informada não seja igual a a, e, i, o ou u.
			if (!(letra.equalsIgnoreCase("a") |
				  letra.equalsIgnoreCase("e") |
				  letra.equalsIgnoreCase("i") |
				  letra.equalsIgnoreCase("o") |
				  letra.equalsIgnoreCase("u")) ) {
				//Atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
				consoantes[count] = letra;
				quantConsoantes++;
			}
			
			count++; //Acrescente o valor 1 ao contador a cada loop.
			
		}while(count < consoantes.length); //Enquanto o contador tiver o valor menor que o tamanho do array.
		
		System.out.print("Consoantes: ");
		for (String consoante : consoantes) { //Para cada consoante dentro do array consoantes.
			
			if (consoante != null) { //E se o valor da consoante for diferente de null.
				System.out.print(consoante + " "); //Se imprime a consoante.+-
			}			
		}
		System.out.print("\n"); //Pula uma linha.
		System.out.println("Quantidade de consoantes: " + quantConsoantes); //Imprime a quanidade de consoantes digitadas.
	}
}
