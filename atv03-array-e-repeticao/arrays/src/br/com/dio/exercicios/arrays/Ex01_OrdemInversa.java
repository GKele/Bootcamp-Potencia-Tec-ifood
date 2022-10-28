package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros e
mostre-os na ordem inversa.  
*/
public class Ex01_OrdemInversa {
	public static void main(String[] args) {
		
		int[] vetor = {1, 8, 3, 4, 5, 6}; //inicializando um vetor com 6 elementos.
		
		System.out.print("Vetor: ");
		int contador = 0;	
		
		while(contador < (vetor.length)) { //Lenght: propriedade do vetor que retona o tamanho do mesmo
			System.out.print(vetor[contador] + " ");
			contador++;
		}
		
		System.out.println("\n------------------"); //Pula uma linha.
		
		System.out.print("Vetor invertido: ");
		//O contador deverá ser um número menor que o tamanho do vetor.
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}
