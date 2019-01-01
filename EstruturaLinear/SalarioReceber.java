/*
 * Problema: Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber, sabendo-se que esse funcionário 
 * tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base. 
 */

 import java.util.Scanner;

 class SalarioReceber{
     public static void main(String[] args){
         Scanner ler = new Scanner(System.in);
         double salarioBase, salarioReceber, gratificacao = 0.05, imposto = 0.07;
         System.out.print("Digite o valor do salario base R$ ");
         salarioBase = ler.nextDouble();
         salarioReceber = salarioBase + (salarioBase * gratificacao);
         salarioReceber = salarioReceber - (salarioBase * imposto);
         System.out.print("O salario final e de R$ "+salarioReceber);
     }
 }