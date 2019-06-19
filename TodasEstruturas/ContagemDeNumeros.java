/*
 * Problema: Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100], e mostre o resultado na tela. 
 * A entrada de dados deverá terminar quando for lido um número negativo.
 */

 import java.util.Scanner;

 class ContagemDeNumeros{
     public static void main(String[] args){
        int intervalo0_25 = 0, intervalo26_50 = 0, intervalo51_75 = 0, intervalo76_100 = 0, valor;
        Scanner read = new Scanner(System.in);
        do{
            System.out.print("Digite um valor >>> ");
            valor = read.nextInt();
            if(valor >= 0 && valor <= 25)
                intervalo0_25++;
            else if(valor >= 26 && valor <= 50)
                intervalo26_50++;
            else if(valor >= 51 && valor <= 75)
                intervalo51_75++;
            else if(valor >= 76 && valor <= 100)
                intervalo76_100++;
        }while(valor >= 0);
        System.out.println("Valores no intervalo de 0-25 "+intervalo0_25);
        System.out.println("Valores no intervalo de 26-50 "+intervalo26_50);
        System.out.println("Valores no intervalo de 51-75 "+intervalo51_75);
        System.out.println("Valores no intervalo de 76-100 "+intervalo76_100);
     }
 }