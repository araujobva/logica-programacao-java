/* 
 * Problema: Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
 * a) A idade dessa pessoa em anos.
 * b) Quantos anos essa pessoa terá em 2050.
 * c) A idade dessa pessoa em meses.
 * d) A idade dessa pessoa em dias.
 * e) A idade dessa pessoa em semanas.
 */

import java.util.Scanner;

 class CalculoIdade{
     public static void main(String[] args){
         int anoNascimento, anoAtual, idade, idade2050, idadeMeses, idadeDias, idadeSemanas;
         System.out.print("Digite o ano de nascimento >> ");
         Scanner read = new Scanner(System.in);
         anoNascimento = read.nextInt();
         System.out.print("Digite o ano atual >> ");
         anoAtual = read.nextInt();
         idade = anoAtual - anoNascimento;
         idade2050 = 2050 - anoNascimento;
         idadeMeses = idade * 12;
         idadeDias = idade * 365;
         idadeSemanas = idade * 52;
         System.out.println("Idade = "+idade);
         System.out.println("Idade em 2050 = "+idade2050);
         System.out.println("Idade em meses = "+idadeMeses);
         System.out.println("Idade em dias = "+idadeDias);
         System.out.println("Idade em semanas = "+idadeSemanas);
     }
 }