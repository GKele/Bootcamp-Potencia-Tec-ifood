package one.digitalInnovation.basecamp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do empréstimo: ");
		double valor = scan.nextDouble();
		
		System.out.print("Digite a quantidade de parcelas: ");
		int parcelas = scan.nextInt();
		
		Emprestimo.calcular(valor, parcelas); //Chama o método calcular da classe Emprestimo
	}
}
