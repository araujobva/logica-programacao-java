//Problema: Pegue uma quantidade de valores indeterminados do usuários e mostre apenas os negativos. O programa encerrará e mostrará o resultado quando o usuário digitar 0.

import java.util.Scanner;
import java.util.ArrayList;

class ValoresNegativos{
	public static void main(String[] args){
		double valor, saida = 1;
		Scanner read = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>();	
		do{
			System.out.print("Digite um valor  >> ");
			valor = read.nextDouble();
			lista.add(valor);
			if(valor == 0)
				saida = 0;
		}while(saida != 0);
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i) < 0)
				System.out.println(lista.get(i));
		}
	}
}
