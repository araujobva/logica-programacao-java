//Problema: Resolva o fatorial de forma recursiva de um valor inserido pelo usuário.

import java.util.Scanner;

class FatorialRecursividade{

	public static void main(String[] args){
		int valor;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um valor para calcular seu fatorial >> ");
		valor = read.nextInt();
		int fat = fatorial(valor);
		System.out.println("O fatorial de "+valor+" é de "+fat);
	}
	
    static int fatorial(int valor){
	    if(valor <= 1)
	        return 1;
	    int r = fatorial(valor - 1) * valor;	    
	    return r;
	}
	
}
