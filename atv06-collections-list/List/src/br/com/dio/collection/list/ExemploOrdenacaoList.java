package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Dadas as seguintes informações sobre os meus gatos,
crie uma lista e ordene esta lista exibindo:
	nome - idade - cor
	
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */

public class ExemploOrdenacaoList {
	public static void main(String[] args) {

		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato("Joh", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Joh", 12, "amarelo"));
		}};
		//Apresentar por ordem de inserção
		System.out.println("Exibir por ordem de inserção: ");
		System.out.print(meusGatos);
		System.out.println("\n");
		
		//Apresentar por ordem aleatória
		System.out.println("Exibir por ordem aleatória: ");
		//Usar o método de Collections .shuffle
		Collections.shuffle(meusGatos);
		System.out.print(meusGatos);
	}
}

class Gato{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}	
}
