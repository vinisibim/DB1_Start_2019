package br.com.db1Start.exercicio1;

public class Menor_que_10 {
	public Menor_que_10(int num1) {
		if (num1 < 10) {
			System.out.println(+num1 + " n�o � maior que 10");
		} else if (num1 == 10) {
			System.out.println(+num1 + " � igual a 10");
		} else {
			System.out.println(+num1 + " � maior que 10");
		}
	}
}
