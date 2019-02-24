package br.com.db1Start.exercicio3;

import java.util.Scanner;

/* Faça um programa que o usuário poderá inserir um nome de cidade. O programa deverá informar:
* Qual o estado que a cidade pertence
* Se é capital ou não
* O conjunto de cidades permitidas devem ser as seguintes: Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.
Cenário para testes: 
* Ao informar o nome da cidade Curitiba, deve retornar "Pertence ao PR", "É capital"
* Ao informar o nome da cidade Maringá, deve retornar "Pertence ao PR", "Não é capital"
* Ao informar o nome da cidade Porto Alegre, deve retornar "Pertence ao RS", "É capital"
*/
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux = 0, i = 0;
		while (aux < 100) {
			System.out.println("Digite o nome de uma das cidades abaixo:");
			System.out.println("Curitiba, Maringá, Londrina, Pinhais,"
					+ " Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.");

			String cidade = scan.nextLine();
			cidade = cidade.toLowerCase();

			switch (cidade) {
			case "maringa":
				System.out.println("Pertence ao PR, não é capital");
				break;

			case "londrina":
				System.out.println("Pertence ao PR, não é capital");
				break;

			case "curitiba":
				System.out.println("Pertence ao PR, é capital");
				break;

			case "pinhais":
				System.out.println("Pertence ao PR, não é capital");
				break;

			case "chapecó":
				System.out.println("Pertence a SC, não é capital");
				break;

			case "joinvile":
				System.out.println("Pertence a SC, não é capital");
				break;

			case "blumenau":
				System.out.println("Pertence a SC, não é capital");
				break;

			case "florianopolis":
				System.out.println("Pertence a SC, é capital");
				break;

			case "porto alegre":
				System.out.println("Pertence a RS, não é capital");
				break;

			case "gramado":
				System.out.println("Pertence a RS, é capital");
				break;

			default:
				System.out.println("Cidade não encontrada em nosso banco de dados ou digitada incorretamente.");
				break;
			}

			System.out.println("Deseja pesquisar outra cidade? Digite SIM ou NÃO!");
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
