package br.com.db1Start.exercicio1;

import java.util.Scanner;

/** � ou n�o PAR 
* � ou n�o IMPAR 
* � ou n�o maior que 10
* o dobro do valor digitado
* � ou n�o primo
Cen�rio para testes: 
* Ao informar o n�mero 2, deve retornar "� par", "n�o � impar", "n�o � maior que 10", "o dobro de 2 � 4", "� primo"
* Ao informar o n�mero 11, deve retornar "n�o � par", "� impar", "� maior que 10", "o dobro de 11 � 22", "� primo"
*/


public class Exercicio1 {

		public Exercicio1 () {
			Scanner scan = new Scanner (System.in);
			int ret = 0;
			while(ret < 100) {
			System.out.println("Insira um numero para verificar.");
			double num1 = scan.nextDouble();
			double aux;
			if (num1 % 2 == 0) {
				System.out.println(+num1+ " � par, n�o � impar");
			}
			else {
				System.out.println(+num1+ " n�o � par, � impar");
			}
			
			
			if (num1 < 10) {
				System.out.println(+num1+ " n�o � maior que 10");
			}
			else if (num1 == 10) {
				System.out.println(+num1+ " � igual a 10");
			}
			else {
				System.out.println(+num1+ " � maior que 10");
			}
			
			aux = num1 + num1;
			System.out.println("o dobro de " +num1+ " � " +aux+",");
			
			
			for(aux = 2; aux < num1; aux++) {
				if (num1%aux == 0){
					System.out.println(+num1+ " n�o � primo");
					break;
				}
				else {
					System.out.println(+num1+" � primo");
					break;
				}
			}
			
			System.out.println("Deseja verificar outro numero ?");
			System.out.println("Tecle 1 para SIM e 2 para N�O");
			
			aux = scan.nextDouble();
			if (aux == 1) {
				ret++;
			}
			else {
				break;
			}
			}
		}
		
		public static void main(String[] args) {
			Exercicio1 init = new Exercicio1();
		}
		

}
