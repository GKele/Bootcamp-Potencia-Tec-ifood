package me.digitalInnovation.OO;

import java.util.Scanner;

/*
Dado um número A e o seu limite N,
encontre a soma de todos os múltiplos A até o seu limite N.
*/
public class SomandoMultiplos {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int A, N;
		int soma = 0;		

        // System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        // System.out.println("Digite o valor do limite N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	if (i % A == 0) {
        		soma = soma + i;
        	}
        }  
        //Soma dos múltiplos de A até o limite N
        System.out.print(soma);
	}
}

