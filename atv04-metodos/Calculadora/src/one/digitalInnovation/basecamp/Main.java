package one.digitalInnovation.basecamp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculadora:");
		System.out.print("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		System.out.print("\n"); //Pula linha
		
		System.out.println("Resultados: ");
		
		//Faz a operação de soma	
		Operacoes.soma(numero1, numero2);		
		System.out.print("\n");
		
		//Faz a operação de subtração
		Operacoes.subtracao(numero1, numero2);
		System.out.print("\n");
		
		//Faz a multiplicação
		Operacoes.multiplicacao(numero1, numero2);
		System.out.print("\n");
		
		//Faz a divisão
		Operacoes.divisao(numero1, numero2);
		System.out.print("\n");
		
	}

}
