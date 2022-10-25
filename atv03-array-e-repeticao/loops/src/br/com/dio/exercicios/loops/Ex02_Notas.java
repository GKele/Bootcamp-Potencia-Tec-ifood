package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja inválido (10 < nota < 0) e
continue pedido até que o usuário informe um valor válido.
*/

public class Ex02_Notas {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota INVÁLIDA, digite novamente!");
            nota = scan.nextInt();
        }

        System.out.println("Nota VÁLIDA, programa finalizado!");
    }
}
