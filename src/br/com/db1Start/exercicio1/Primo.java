package br.com.db1Start.exercicio1;

public class Primo {
	public Primo(int num1) {
		for (int aux = 2; aux < num1; aux++) {
			if (num1 % aux == 0) {
				System.out.println(+num1 + " não é primo");
				break;
			} else {
				System.out.println(+num1 + " é primo");
				break;
			}
		}
	}
}
