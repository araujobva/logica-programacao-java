/*
 * Problema: Faça um programa que receba um número inteiro maior que 1 e verifique se o número fornecido é primo ou não. Mostrar a mensagem de número primo 
 * ou de número não primo. Um número é primo quando é divisível apenas pelo número um e por ele mesmo.
 */

import java.util.Scanner;

 class ValorPrimo{
     public static void main(String[] args){
         int valor;
         Scanner read = new Scanner(System.in);
         boolean primo = true;
         System.out.print("Digite um valor inteiro e maior que 1 >> ");
         valor = read.nextInt();
         for(int i = 2; i < valor; i++){
            if((valor % i) == 0){
                primo = false;
                break;
            }
         }
         if(primo)
            System.out.println("O valor "+valor+" e um numero primo!");
        else 
            System.out.println("O valor "+valor+" nao e um numero primo!");
     }
 }