//Problema: Faça um programa que receba três números obrigatoriamente inteiros e em ordem crescente e um quarto número que não siga esta regra. Mostre, em seguida, os quatro números em ordem crescente.

import java.util.Scanner;

class Colocando4ValoresOrdemCrescente{
    public static void main(String[] args){
        int valor1, valor2, valor3, valor4;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro >> ");
        valor1 = read.nextInt();
        System.out.print("Digite o segundo valor inteiro maior que o anterior >> ");
        valor2 = read.nextInt();
        System.out.print("Digite o terceiro valor inteiro maior que os dois anteriores >> ");
        valor3 = read.nextInt();
        System.out.print("Digite o quarto valor inteiro >> ");
        valor4 = read.nextInt();
        if(valor4 > valor1 && valor4 > valor2 && valor4 > valor3)
            System.out.println("Os valores em ordem crescente sao >> "+valor1+" - "+valor2+" - "+valor3+" - "+valor4);
        else if(valor4 > valor1 && valor4 > valor2 && valor4 < valor3)
            System.out.println("Os valores em ordem crescente sao >> "+valor1+" - "+valor2+" - "+valor4+" - "+valor3);
        else if(valor4 > valor1 && valor4 < valor2)
            System.out.println("Os valores em ordem crescente sao >> "+valor1+" - "+valor4+" - "+valor2+" - "+valor3);
        else if(valor4 < valor1)
            System.out.println("Os valores em ordem crescente sao >> "+valor4+" - "+valor1+" - "+valor2+" - "+valor3);
    }
}