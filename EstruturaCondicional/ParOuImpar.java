//Problema: Faça um programa que receba um valor inteiro, mostre se esse valor é par ou ímpar.

import java.util.Scanner;

class ParOuImpar{
    public static void main(String[] args){
        int valor;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor inteiro >> ");
        valor = read.nextInt();
        valor = valor % 2;
        if(valor == 0)
            System.out.println("O valor digitado e par.");
        else if (valor != 0)
            System.out.println("O valor digitado e impar.");
    }
}

