/*
 * Problema: Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo. 
 * Esse programa deve calcular e mostrar a quantidade de convites que devem ser vendidos para que, pelo menos, o custo do espetáculo seja alcançado. 
 */

import java.util.Scanner;

 class CustoTeatral{
     public static void main(String[] arg){
         double custoTeatral, precoConvite, quantConvites;
         System.out.print("Digite o custo da peca teatral R$ ");
         Scanner read = new Scanner(System.in);
         custoTeatral = read.nextDouble();
         System.out.print("Digite o valor de cada convite R$ ");
         precoConvite = read.nextDouble();
         quantConvites = custoTeatral / precoConvite;
         System.out.println("Devera ser vendido "+quantConvites+" para custear o valor da peca de treatro.");
     }
 }