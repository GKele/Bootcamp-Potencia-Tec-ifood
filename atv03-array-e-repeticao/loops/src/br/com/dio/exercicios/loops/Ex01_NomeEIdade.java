package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*Faça um programa que leia um conjunto de dois valores,
  o primeiro representando o nome do aluno e o segundo a sua idade.
  Pare o programa inserindo o valor 0 no campo nome.*/

public class Ex01_NomeEIdade {

	    public static void main (String[] args){
	        Scanner scan = new Scanner(System.in);

	        String nome;
	        int idade;

	        while(true){
	            System.out.println("Nome: ");
	            nome = scan.next();
	            if(nome.equals("0")) break;

	            System.out.println("Idade: ");
	            idade = scan.nextInt();
	        }

	        System.out.println("O nome está igual a 0. Processo finalizado.");

	    }
}