package br.com.db1Start.exercicio1;

import java.util.Scanner;

public class Inicia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loop = 0, i = 0;
		while (loop < 100) {
			
			System.out.println("Insira um numero para verificar.");
			int num1 = scan.nextInt();
			Par_ou_Impar par = new Par_ou_Impar(num1);
			Menor_que_10 menor = new Menor_que_10(num1);
			Dobro dobro = new Dobro(num1);
			Primo primo = new Primo(num1);

			System.out.println("Deseja verificar outro numero? Digite 1.");
			i = scan.nextInt();

			if (i == 1)
				loop++;
				
				else{break;}
		}

	}

}
