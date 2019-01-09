/*
 * Problema: Faça um programa que receba o salário e o primeiro nome de um funcionário, calcule e  mostre o nome e o novo salário desse funcionário, acrescido de bonificação e de auxílio-escola.
 * -----------
 * Bonificação
 * -----------
 * - Salário até R$ 500,00 bonificação de 5% do salário.
 * - Entre R$ 500,01 e R$ 1.200,00 bonificação de 12% do salário.
 * - Acima de R$ 1.200,00 sem bonificação.
 * --------------
  * Auxílio-Escola
  * --------------
  * - Salário até R$ 600,00 auxílio-escola de R$ 150,00.
  * - Mais que R$ 600,00 auxílio-escola de R$ 100,00.
 */

 import java.util.Scanner;

 class SalarioBonificacao{
     public static void main(String[] arg){
         double salario;
         String nome;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite o primeiro nome do funcionario >> ");
         nome = read.next();
         System.out.print("Digite o valor do salario de um funcionario R$ ");
         salario = read.nextDouble();
         if(salario <= 500){
             salario = salario + (salario * 0.05);

         }else if(salario >= 501 && salario <= 1200){
             salario = salario + (salario * 0.12);
             System.out.println("O nome do funcinario e "+nome);
             System.out.println("O seu novo salario e "+salario);
         }else if(salario > 1200){
             System.out.println("O nome do funcinario e "+nome);
             System.out.println("O seu novo salario e "+salario);
         }
         if(salario <= 600){
             salario = salario + 150;
             System.out.println("O nome do funcinario e "+nome);
             System.out.println("O seu novo salario e "+salario);
         }else if(salario > 600){
             salario = salario + 100;
             System.out.println("O nome do funcinario e "+nome);
             System.out.println("O seu novo salario e "+salario);
         }
     }
 }