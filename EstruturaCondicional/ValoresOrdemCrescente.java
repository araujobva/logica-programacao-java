//Problema: Faça um programa que receba três número e mostre-os em ordem crescente.

import java.util.Scanner;

class ValoresOrdemCrescente{
    public static void main(String[] args){
        float valor1, valor2, valor3;
        System.out.print("Digite o primeiro valor >> ");
        Scanner read = new Scanner(System.in);
        valor1 = read.nextFloat();
        System.out.print("Digite o segundo valor >> ");
        valor2 = read.nextFloat();
        System.out.print("Digite o terceiro valor >> ");
        valor3 = read.nextFloat();
        if(valor1 < valor2 && valor1 < valor3 && valor2 < valor3)
            System.out.print(" "+valor1+" - "+valor2+" - "+valor3);
        else if(valor1 < valor2 && valor1 < valor3 && valor3 < valor2)
            System.out.print(" "+valor1+" - "+valor3+" - "+valor2);
        else if(valor2 < valor1 && valor2 < valor3 && valor1 < valor3)
            System.out.print(" "+valor2+" - "+valor1+" - "+valor3);
        else if(valor2 < valor1 && valor2 < valor3 && valor3 < valor1)
            System.out.print(" "+valor2+" - "+valor3+" - "+valor1);
        else if(valor3 < valor1 && valor3 < valor2 && valor1 < valor2)
            System.out.print(" "+valor3+" - "+valor1+" - "+valor2);
        else if(valor3 < valor1 && valor3 < valor2 && valor2 < valor1)
            System.out.print(" "+valor3+" - "+valor2+" - "+valor1);
    }
}