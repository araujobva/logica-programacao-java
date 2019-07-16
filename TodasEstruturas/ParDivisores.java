/*
 * Problema: Faça um programa que leia um número indeterminado de valores para m, se os valores forem par, armazene-os, se for ímpar, termine o algoritmo e mostre
 * todos os valores pares inseridos anteriormente.
 */

import java.util.Scanner;
import java.util.ArrayList;

class ParDivisores{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int m;
		boolean sentinela = true;
		do{
			System.out.print("Digite um valor inteiro >> ");
			m = read.nextInt();
			if((m % 2) == 0){
				lista.add(m);
			}else{
				sentinela = false;
			}
		}while(sentinela);
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}
}
