package br.com.db1Start.exercicio2;

import java.util.Scanner;

/*
	 * Fa�a um programa que o usu�rio poder� inserir um texto. O programa dever� informar:
*	
*	 quantidade de caracteres do texto
*	 quantidade de espa�os em branco no texto
*	 quantidade de vogais digitadas
	 
	 Cen�rio para testes: 
*	 Ao informar o texto DB1, deve retornar "3 caracteres", "0 espa�os em branco", "0 vogais"
* 	Ao informar o texto DB1 START, deve retornar "9 caracteres", "1 espa�o em branco", "1 vogal"

	 * */
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int espaco = 0, vogais = 0;
		String texto;

		System.out.println("Insira um texto.");
		texto = scan.nextLine();

		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == ' ') {
				espaco++;
			}

			if ((c == 'a') | (c == 'e') | (c == 'i') | (c == 'o') | (c == 'u')) {
				vogais++;
			}
		}

		System.out.println(+texto.length() + " caracteres, " + espaco + " espa�os em branco, " + vogais + " vogais.");

	}
}
