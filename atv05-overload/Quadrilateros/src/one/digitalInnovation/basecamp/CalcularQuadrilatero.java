package one.digitalInnovation.basecamp;

//Calcular a área dos 3 quadriláteros notáveis (quadrado, retângulo e trapézio).

public class CalcularQuadrilatero {
	
	//Calcula a área do quadrado
	public static void area(double lado) {
		System.out.println("A área do quadrado é " + lado * lado);
	}
	
	//Calcula a área do retângulo
	public static void area(double lado1, double lado2) {
		System.out.println("A área do retângulo é " + lado1 * lado2);
	}
	
	//Calcula a área do trapézio
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("A área do trapézio é " + ((baseMenor + baseMaior) * altura) / 2);
	}
}
