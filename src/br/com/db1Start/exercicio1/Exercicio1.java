package br.com.db1Start.exercicio1;

import java.util.Scanner;

/** é ou não PAR 
* é ou não IMPAR 
* é ou não maior que 10
* o dobro do valor digitado
* é ou não primo
Cenário para testes: 
* Ao informar o número 2, deve retornar "é par", "não é impar", "não é maior que 10", "o dobro de 2 é 4", "é primo"
* Ao informar o número 11, deve retornar "não é par", "é impar", "é maior que 10", "o dobro de 11 é 22", "é primo"
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
				System.out.println(+num1+ " é par, não é impar");
			}
			else {
				System.out.println(+num1+ " não é par, é impar");
			}
			
			
			if (num1 < 10) {
				System.out.println(+num1+ " não é maior que 10");
			}
			else if (num1 == 10) {
				System.out.println(+num1+ " é igual a 10");
			}
			else {
				System.out.println(+num1+ " é maior que 10");
			}
			
			aux = num1 + num1;
			System.out.println("o dobro de " +num1+ " é " +aux+",");
			
			
			for(aux = 2; aux < num1; aux++) {
				if (num1%aux == 0){
					System.out.println(+num1+ " não é primo");
					break;
				}
				else {
					System.out.println(+num1+" é primo");
					break;
				}
			}
			
			System.out.println("Deseja verificar outro numero ?");
			System.out.println("Tecle 1 para SIM e 2 para NÃO");
			
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
