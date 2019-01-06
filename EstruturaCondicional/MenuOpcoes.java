/*
 * Problema: Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados necessários para executar cada operação.
 * Menu de opções:
 * 1 - Somar dois números.
 * 2 - Raiz quadrada de um número.
 */

 import java.util.Scanner;

 class MenuOpcoes{
     public static void main(String[] args){
         int op;
         double raizQuadrada, valor1, valor2, soma;
         Scanner read = new Scanner(System.in);
         System.out.print("Menu de opcoes.\n1 - Soma dois valores.\n2 - Efetua a raiz quadrada de um valor.\n>> ");
         op = read.nextInt();
         switch(op){
             case 1:
                System.out.print("Digite o primeiro valor >> ");
                valor1 = read.nextDouble();
                System.out.print("Digite o segundo valor >> ");
                valor2 = read.nextDouble();
                soma = valor1 + valor2;
                System.out.println("A soma dos 2 valores e de "+soma);
                break;
             case 2:
                System.out.print("Digite um valor para ser efetuado a raiz quadrada >> ");
                valor1 = read.nextDouble();
                valor2 = Math.sqrt(valor1);
                System.out.print("A raiz quadrada de "+valor1+" e >> "+valor2);
             break;
             default:
                System.out.println("Opcao invalida!");
         }
     }
 }