package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 e 10. 
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser:

Tabuada do 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex05_Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		
		System.out.print("Digite um número: ");
		tabuada = scan.nextInt();
		
		//O laço só é iniciado se o número digitado pelo usuário for entre 1 e 10.
		if(0 < tabuada && tabuada <= 10) {		
			System.out.println("Tabuada do " + tabuada);
			
			//Para variável i = 1, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
			for(int i = 1; i <= 10 ; i++) {
				System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
			}
		}else{
			System.out.println("Numero inválido"); //Caso o número seja menor que 1 e maior que 10
		}		
	}
}
