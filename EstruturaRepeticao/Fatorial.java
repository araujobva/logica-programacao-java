/*
 * Problema: Faça um programa que leia um número N inteiro, e faça o fatorial deste número.
 */

 import java.util.Scanner;

 class Fatorial{
     public static void main(String[] args){
         Scanner read = new Scanner(System.in);
         int n, x = 1;
         System.out.print("Digite um valor inteiro >> ");  
         n = read.nextInt();
         for(int i = 1; i <= n; i++){
             x = i * x;
             System.out.print(x+" - ");
         }
     }
 }


