/* 
 * Problema: Dizemos que um número natural é triangular se ele é produto de três números naturais consecutivos. 
 * Exemplo: 120 é triangular, pois 4*5*6 = 120.
 * Dado um inteiro não-negativo n, verificar se n é triangular. 
 */

import java.util.Scanner;

class ValorTriangular{
	public static void main(String[] args){
		int n, mult;
		boolean verificacao = false;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um valor inteiro >> ");
		n = read.nextInt();
		for(int i = 1; i < n; i++){
			mult = i * (i+1) * (i+2);
			if(mult == n)
				verificacao = true;
		}
		if(verificacao)
			System.out.println("O valor digitado "+n+" é um valor triangular.");
		else
			System.out.println("O valor digitado "+n+" não é um valor trangular.");
	}
}
