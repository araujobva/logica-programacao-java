/*
 * Problema: Faça um programa que receba quatro valores, I, A, B e C. I é um valor inteiro e positivo e A, B e C são valores reais. 
 * Escreva os números A, B e C obedecendo à tabela a seguir.
 * - Se o valor de I for 1, mostre A, B e C em ordem crescente.
 * - Se o valor de I for 2, mostre A, B e C em ordem decrescente.
 * - Se o valor de I for 3 ou maior, o maior número fica entre os outros dois números.
 */

 import java.util.Scanner;

 class TabelaValores{
     public static void main(String[] args){
         int i;
         float a, b, c;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite um valor inteiro >> ");
         i = read.nextInt();
         System.out.print("Digite o primeiro valor real >> ");
         a = read.nextFloat();
         System.out.print("Digite o segundo valor real >> ");
         b = read.nextFloat();
         System.out.print("Digite o terceiro valor real >> ");
         c = read.nextFloat();
        if(i == 1){
            if(a < b && b < c){
                System.out.print("Os valores em ordem crescente sao >> "+a+" - "+b+" - "+c);
            }else if(a < c && c < b){
                System.out.print("Os valores em ordem crescente sao >> "+a+" - "+c+" - "+b);
            }else if(b < a && a < c){
                System.out.print("Os valores em ordem crescente sao >> "+b+"- "+a+" - "+c);
            }else if(b < c && c < a){
                System.out.print("Os valores em ordem crescente sao >> "+b+" - "+c+" - "+a);
            }else if(c < b && b < a){
                System.out.print("Os valores em ordem crescente sao >> "+c+" - "+b+" - "+a);
            }else if(c < a && a < b){
                System.out.print("Os valores em ordem crescente sao >> "+c+" - "+a+" - "+b);
            }
        }
        if(i == 2){
            if(a > b && b > c){
                System.out.print("Os valores em ordem decrescente sao >> "+a+" - "+b+" - "+c);
            }else if(a > c && c > b){
                System.out.print("Os valores em ordem decrescente sao >> "+a+" - "+c+" - "+b);
            }else if(b > a && a > c){
                System.out.print("Os valores em ordem decrescente sao >> "+b+"- "+a+" - "+c);
            }else if(b > c && c > a){
                System.out.print("Os valores em ordem decrescente sao >> "+b+" - "+c+" - "+a);
            }else if(c > b && b > a){
                System.out.print("Os valores em ordem decrescente sao >> "+c+" - "+b+" - "+a);
            }else if(c > a && a > b){
                System.out.print("Os valores em ordem decrescente sao >> "+c+" - "+a+" - "+b);
            }
        }
        if(i == 3 || i > 3){
            if(a > b && b > c){
                System.out.print("O maior valor ficando no meio >> "+b+" - "+a+" - "+c);
            }else if(a > c && c > b){
                System.out.print("O maior valor ficando no meio >> "+c+" - "+a+" - "+b);
            }else if(b > a && a > c){
                System.out.print("O maior valor ficando no meio>> "+a+"- "+b+" - "+c);
            }else if(b > c && c > a){
                System.out.print("O maior valor ficando no meio >> "+c+" - "+b+" - "+a);
            }else if(c > b && b > a){
                System.out.print("O maior valor ficando no meio >> "+b+" - "+c+" - "+a);
            }else if(c > a && a > b){
                System.out.print("O maior valor ficando no meio >> "+a+" - "+c+" - "+b);
            }
        }
     }
 }