package br.com.db1Start.exercicio3;

import java.util.Scanner;

/* Fa�a um programa que o usu�rio poder� inserir um nome de cidade. O programa dever� informar:
* Qual o estado que a cidade pertence
* Se � capital ou n�o
* O conjunto de cidades permitidas devem ser as seguintes: Curitiba, Maring�, Londrina, Pinhais, Chapec�, Joinvile, Blumenau, Florian�polis, Porto Alegre, Gramado.
Cen�rio para testes: 
* Ao informar o nome da cidade Curitiba, deve retornar "Pertence ao PR", "� capital"
* Ao informar o nome da cidade Maring�, deve retornar "Pertence ao PR", "N�o � capital"
* Ao informar o nome da cidade Porto Alegre, deve retornar "Pertence ao RS", "� capital"
*/
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux = 0, i = 0;
		while (aux < 100) {
			System.out.println("Digite o nome de uma das cidades abaixo:");
			System.out.println("Curitiba, Maring�, Londrina, Pinhais,"
					+ " Chapec�, Joinvile, Blumenau, Florian�polis, Porto Alegre, Gramado.");

			String cidade = scan.nextLine();
			cidade = cidade.toLowerCase();

			switch (cidade) {
			case "maringa":
				System.out.println("Pertence ao PR, n�o � capital");
				break;

			case "londrina":
				System.out.println("Pertence ao PR, n�o � capital");
				break;

			case "curitiba":
				System.out.println("Pertence ao PR, � capital");
				break;

			case "pinhais":
				System.out.println("Pertence ao PR, n�o � capital");
				break;

			case "chapec�":
				System.out.println("Pertence a SC, n�o � capital");
				break;

			case "joinvile":
				System.out.println("Pertence a SC, n�o � capital");
				break;

			case "blumenau":
				System.out.println("Pertence a SC, n�o � capital");
				break;

			case "florianopolis":
				System.out.println("Pertence a SC, � capital");
				break;

			case "porto alegre":
				System.out.println("Pertence a RS, n�o � capital");
				break;

			case "gramado":
				System.out.println("Pertence a RS, � capital");
				break;

			default:
				System.out.println("Cidade n�o encontrada em nosso banco de dados ou digitada incorretamente.");
				break;
			}

			System.out.println("Deseja pesquisar outra cidade? Digite SIM ou N�O!");
			cidade = scan.nextLine();
			cidade.toLowerCase();
			switch (cidade) {
			case "sim":
				aux++;
				break;

			default:
				break;

			}
			i = aux;
			if (aux == i)
				break;
		}
	}
}
