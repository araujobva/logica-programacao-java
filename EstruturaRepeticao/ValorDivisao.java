/*
 * Problema: Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
 * E = 1 + 1/1 + 1/2 + 1/3 + ... + 1/N.
 */

 import java.util.Scanner;

 class ValorDivisao{
     public static void main(String[] args){
         Scanner read = new Scanner(System.in);
         int n;
         double e = 1;
         System.out.print("Digite um valor inteiro e positivo >> ");
         n = read.nextInt();
         for(int i = 1; i <= n; i++){
             e = e + 1/i;
         }
         System.out.println("O valor de E = "+e);
     }
 }