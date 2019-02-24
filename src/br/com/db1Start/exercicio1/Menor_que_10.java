package br.com.db1Start.exercicio1;

public class Menor_que_10 {
	public Menor_que_10(int num1) {
		if (num1 < 10) {
			System.out.println(+num1 + " não é maior que 10");
		} else if (num1 == 10) {
			System.out.println(+num1 + " é igual a 10");
		} else {
			System.out.println(+num1 + " é maior que 10");
		}
	}
}
