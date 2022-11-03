package one.digitalInnovation.basecamp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo?");
		System.out.println("3 - Trapézio");
		System.out.print("Qual quadrilatero deseja calcular a área? ");
		int NumeroQuadrilatero = scan.nextInt();
		
		if (NumeroQuadrilatero == 1) { //Caso o quadrado seja escolhido
			System.out.println("Digite o valor do lado: ");
			double lado = scan.nextDouble();
			
			CalcularQuadrilatero.area(lado);
		}else if(NumeroQuadrilatero == 2) { //Caso o retângulo seja escolhido
			System.out.println("Digite o valor do lado 1: ");
			double lado1 = scan.nextDouble();
			System.out.println("Digite o valor do lado 2: ");
			double lado2 = scan.nextDouble();
			
			CalcularQuadrilatero.area(lado1, lado2);
		}else if (NumeroQuadrilatero == 3) { //Caso o trapézio seja escolhido
			System.out.println("Digite o valor da base maior: ");
			double baseMaior = scan.nextDouble();
			System.out.println("Digite o valor da base menor: ");
			double baseMenor = scan.nextDouble();
			System.out.println("Digite o valor da altura: ");
			double altura = scan.nextDouble();
			
			CalcularQuadrilatero.area(baseMaior, baseMenor, altura);
		}else { //Caso outro número seja digitado
			System.out.print("Opção INVÁLIDA!");
		}
	}

}
