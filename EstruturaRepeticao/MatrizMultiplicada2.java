//Problema: Crie uma matriz 2x3 inteira, peça ao usuário que preencha esta matriz e no final mostre a matriz multiplicada por 2.

import java.util.Scanner;

class MatrizMultiplicada2{
    public static void main(String[] args){
        int[][] matriz = new int[2][3];        
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Digite um valor >> ");
                matriz[i][j] = read.nextInt() * 2;
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" - "+matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
}