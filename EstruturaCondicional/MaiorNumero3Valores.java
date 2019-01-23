//Problema: Crie um programa que receba três números e mostre o maior.

import java.util.Scanner;

class MaiorNumero3Valores{
    public static void main(String[] args){
        float valor1, valor2, valor3;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro valor >> ");
        valor1 = read.nextFloat();
        System.out.print("Digite o segundo valor >> ");
        valor2 = read.nextFloat();
        System.out.print("Digite o terceiro valor >> ");
        valor3 = read.nextFloat();
        if(valor1 > valor2 && valor1 > valor3)
            System.out.print("O primeiro valor inserido "+valor1+" e o maior.");
        else if(valor2 > valor1 && valor2 > valor3)
            System.out.print("O segundo valor inserido "+valor2+" e o maior.");
        else if(valor3 > valor1 && valor3 > valor2)
            System.out.print("O terceiro valor inserido "+valor3+" e o maior.");
    }
}