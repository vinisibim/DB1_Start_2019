package br.com.db1Start.exercicio1;

public class Par_ou_Impar {
	public Par_ou_Impar(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(+num1 + " � par, n�o � impar");
		} else {
			System.out.println(+num1 + " n�o � par, � impar");
		}
	}
}
