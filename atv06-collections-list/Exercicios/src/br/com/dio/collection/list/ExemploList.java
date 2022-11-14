package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.6}, faça:

1. Crie uma lista e adcione as 7 notas;
2. Exiba a posição da nota 5;
3. Adicione na lista a nota 8.0 na posição 4;
4. Substitua a nota 5.0 pela nota 6.0;
5. Confira se a nota 5 está na lista;
6. Exiba todas as notas na ordem em que foram informadas;
7. Exiba a terceira nota adicionada;
8. Exiba a menor nota;
9. Exiba a maior nota;
10. Exiba a soma dos valores;
11. Exiba a média das notas;
12. Remova a nota 0;
13. Remova a nota da posição 0;
14. Remova as notas menores que 7 e exiba a lista;
15. Apague toda a lista;
16. Confira se a lista está vazia.
*/

public class ExemploList {

	public static void main(String[] args) {
		//Ex01. Crie uma lista e adcione as 7 notas:
		//Criação de lista do tipo double
		List<Double> notas = new ArrayList<>();
		//Adiciona apenas os elementos, a ordem é conforme for adcionado (as 7 notas)
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.print(notas); //Impressao da lista
		System.out.print("\n");
		
		//Ex02. Exiba a posição da nota 5.0:
		//index.Of() = Se informa o objeto que se deseja obter a posição
		System.out.print("Posição: " + notas.indexOf(5.0));
		System.out.print("\n");
		
		//Ex03. Adicione na lista a nota 8.0 na posição 4;
		notas.add(4, 8.0); //Informe a posição e o objeto
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex04. Substitua a nota 5.0 pela nota 6.0;
		// Usa-se o .indexOf() para pegar a posição e o .set para fazer a mudança
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex05. Confira se a nota 5 está na lista;
		//.contains() = retorna um boolean;
		System.out.print("A nota 5.0 está na lista? " + notas.contains(5.0));
		System.out.print("\n");
		
		//Ex06. Exiba todas as notas na ordem em que foram informadas;
		//For-each = Impressao das notas uma abaixo da outra;
		for(Double nota : notas) System.out.println(nota);
		System.out.print("\n");
		
		//Ex07. Exiba a terceira nota adcionada;
		//Método .get() = pega o elemento na posição que for informado;
		System.out.print("Terceira nota adicionada: " + notas.get(2));
		System.out.print("\n");
		
		//Ex08. Exiba a menor nota;
		//Não existe um método nativo no List;
		//Pode-se utilizar da Collection o método Collections.min();
		System.out.print("Menor nota: " + Collections.min(notas));
		System.out.print("\n");
		
		//Ex09. Exiba a maior nota;
		//Utiliza-se Collections.max();
		System.out.print("Maior nota: " + Collections.max(notas));
		System.out.print("\n");
		
		//Ex10. Exiba a soma dos valores;
		//Utiliza-se o método Iterator
		Iterator<Double> iterator = notas.iterator();		
		Double soma = 0.0;
		//Laço para verificar se tem proximos elementos;
		while(iterator.hasNext()){ 
			Double next = iterator.next();
			soma += next; 					
		}
		System.out.print("Soma das notas: " + soma);
		System.out.print("\n");
		
		//Ex11. Exiba a média das notas;
		//Método .size = retorna a quantidade (int) de elementos dentro do List;
		System.out.print("Média das notas: " + (soma/notas.size()));
		System.out.print("\n");
		
		//Ex12. Remova a nota 0;
		// .remove(), pode-se passar a posição(int) ou o objeto(o);
		notas.remove(0.0);
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex13. Remova a nota da posição 0;
		notas.remove(0);
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex14. Remova as notas menores que 7 e exiba a lista;
		Iterator<Double> iterator1 = notas.iterator();
		//Looping para verificar se o próximo elemento é menor do que 7;
		while(iterator1.hasNext()){
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex15. Apague toda a lista;
		//Método .clear() = apagua toda uma lista
		notas.clear();
		System.out.print(notas);
		System.out.print("\n");
		
		//Ex16. Confira se a lista está vazia.
		//Método boolean .isEmpty()
		System.out.print("A lista está vazia? " + notas.isEmpty());
		System.out.print("\n");
	}

}
