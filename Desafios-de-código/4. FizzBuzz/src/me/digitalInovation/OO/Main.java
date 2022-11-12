package me.digitalInovation.OO;

import java.util.Scanner;

/*
 Neste desafio, você terá que criar uma função
 que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz": 
 
- Se o número for um múltiplo de 3 e 5 -> "FizzBuzz";
- Se o número for apenas múltiplo de 3 -> "Fizz" ; 
- Se o número for apenas múltiplo de 5 -> "Buzz"; 
- Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 
*/

public class Main {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = number.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) { //Se o número for um múltiplo de 3 e 5
			System.out.print("FizzBuzz");
		}else if(num % 3 == 0) { //Se o número for apenas múltiplo de 3
			System.out.print("Fizz");
		}else if(num % 5 == 0) { //Se o número for apenas múltiplo de 5
			System.out.print("Buzz");
		}else { //Se o número não for um múltiplo de 3 ou 5
			System.out.print(num);
		}
	}

}
