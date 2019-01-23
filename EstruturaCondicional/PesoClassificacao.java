/*
 * Problema: Faça um programa que receba a altura e o peso de uma pessoa. De acordo com as informações abaixo, verifique e mostre qual a classificação dessa pessoa.
 * - Altura menor que 1,20: Peso até 60 classificação A, entre 60 e 90 (inclusive) classificação D e acima de 90 classificação G.
 * - Altura de 1,20 a 1,70: Peso até 60 classificação A, entre 60 e 90 (inclusive) classificação E e acima de 90 classificação H.
 * - Altura maior que 1,70: Peso até 60 classificação C, entre 60 e 90 (inclusive) classificação F e acima de 90 classificação I.
 */

 import java.util.Scanner;

 class PesoClassificacao{
     public static void main(String[] args){
         float altura, peso;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite a altura >> ");
         altura = read.nextFloat();
         System.out.print("Digite o peso >> ");
         peso = read.nextFloat();
         if(altura < 1.20 && peso <= 60){
             System.out.print("Classificacao A");         
        }else if(altura < 1.20 && peso > 60 && peso <= 90){
            System.out.print("Classificacao D");
        }else if(altura < 1.20 && peso > 90){
            System.out.print("Classificacao G");
        }
         if(altura >= 1.20 && altura <= 1.70 && peso <= 60){
             System.out.print("Classificacao A");         
        }else if(altura >= 1.20 && altura <= 1.70 && peso > 60 && peso <= 90){
            System.out.print("Classificacao E");
        }else if(altura >= 1.20 && altura <= 1.70 && peso > 90){
            System.out.print("Classificacao H");
        }
         if(altura > 1.70 && peso <= 60){
             System.out.print("Classificacao C");         
        }else if(altura > 1.70 && peso > 60 && peso <= 90){
            System.out.print("Classificacao F");
        }else if(altura > 1.70 && peso > 90){
            System.out.print("Classificacao I");
        }
     }
 }