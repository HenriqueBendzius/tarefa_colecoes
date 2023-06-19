package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNomes {
	public static void main(String[] args) {

		// Criando uma lista de nomes femininos
		ArrayList<String> nomesFemininos = new ArrayList<String>();

		System.out.println("***parte 1 ***");

		nomesFemininos.add("Maria");
		nomesFemininos.add("Ana");
		nomesFemininos.add("Carla");
		nomesFemininos.add("Fernanda");

		// Criando uma lista de nomes masculinos
		ArrayList<String> nomesMasculinos = new ArrayList<String>();
		nomesMasculinos.add("João");
		nomesMasculinos.add("Pedro");
		nomesMasculinos.add("Lucas");
		nomesMasculinos.add("Henrique");

		// Imprimindo a lista de nomes femininos
		System.out.println("Nomes Femininos:");
		for (String nome : nomesFemininos) {
			System.out.println(nome);

		}

		System.out.println("*******************");
		System.out.println("");

		// Imprimindo a lista de nomes masculinos
		System.out.println("Nomes Masculinos:");
		for (String nome : nomesMasculinos) {
			System.out.println(nome);

		}

	}

}
