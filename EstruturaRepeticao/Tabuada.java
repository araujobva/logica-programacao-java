//Problema: Faça um programa que calcule e mostre a tabuada de um número digitado pelo usuário.

import java.util.Scanner;

class Tabuada{
    public static void main(String vetor[]){
        int valor, tabuada;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor inteiro maior que zero >> ");
        valor = read.nextInt();
        for(int i = 1; i <= 10; i++){
            tabuada = i * valor;
            System.out.println(valor+" * "+i+" = "+tabuada);
        }
    }
}