package one.digitalInnovation.basecamp;

public class Emprestimo {
	//Métodos de taxas
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.45;
	}

	
	//Método principal da classe Empréstimo que faz a chamada dos métodos de taxas e calcula o valor final
	public static void calcular(double valor, int parcelas) {
		if(parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
			
		} else if(parcelas == 3){
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			
			System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
			
		} else {
			System.out.println("Quantidade de parcelas não aceita!");
		}
	}
}
