/*
 * Problema: João recebeu seu salário e precisa pagar duas contas que estão atrasadas. Como as contas estão atrasadas, João terá de pagar multa 
 * de 2% sobre cada conta. Faça um programa que calcule e mostre quanto restará do salário de João.
 */

 import java.util.Scanner;

 class ContasJoao{
     public static void main(String[] args){
        double salJoao, conta1, conta2, multa = 0.02;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do salario do Joao R$ ");
        salJoao = read.nextDouble();
        System.out.print("Digite o valor da primeira conta a ser paga R$ ");
        conta1 = read.nextDouble();
        System.out.print("Digite o valor da segunda conta a ser paga R$ ");
        conta2 = read.nextDouble();
        salJoao = salJoao - ((conta1 * multa + conta2 * multa) + (conta1 + conta2));
        System.out.println("Restara "+salJoao+" do salario do senhor Joao.");
     }
 }