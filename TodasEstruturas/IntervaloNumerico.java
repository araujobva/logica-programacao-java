/*
 * Problema: Ler uma quantidade indeterminada de números positivos e contar quantos deles estão nos seguintes
 * intervalos: [0, 25], [26, 50], [51, 75] e [76, 100]. A entrada de dados deve terminar quanto for lido um número negativo, ao fim mostre a contagem.
 */

import java.util.Scanner;

class IntervaloNumerico{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int valor, cont0_25 = 0, cont26_50 = 0, cont51_75 = 0, cont76_100 = 0;
		do{
			System.out.print("Digite um valor inteiro >> ");
			valor = read.nextInt();
			if(valor >=0 && valor <= 25)
				cont0_25++;
			else if(valor >= 26 && valor <= 50)
				cont26_50++;
			else if(valor >= 51 && valor <= 75)
				cont51_75++;
			else if(valor >= 76 && valor <= 100)
				cont76_100++;
		}while(valor >= 0);
		System.out.println("Valores de 0 a 25 é "+cont0_25);
		System.out.println("Valores de 26 a 50 é "+cont26_50);
		System.out.println("Valores de 51 a 75 é "+cont51_75);
		System.out.println("Valores de 76 a 100 é "+cont76_100);
	}
}
