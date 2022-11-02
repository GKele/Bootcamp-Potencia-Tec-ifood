package one.digitalInnovation.basecamp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o horário: ");
		int hora = scan.nextInt();
		
		Mensagem.obterMensagem(hora);
	}

}
