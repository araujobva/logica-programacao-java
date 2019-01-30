/*
 * Problema: Faça um programa que receba o valor do salário mínimo, o turno de trabalho (M - Matutino, V - Vespertino ou N - Noturno), e a categoria (O - Operário, G - Gerente). 
 * Calcule e mostre o salário bruto de acordo com as regra abaixo:
 * - O bônus no salário, de acordo com a tabela a seguir:
 * - M - Matutino 10% a mais no valor do salário mínimo.
 * - V - Vespertino 15% a mais no valor do salário mínimo.
 * - N - Noturno 20% a mais no valor do salário mínimo.
 * NOTA: Se for operário recebe mais 2% de aumento, se for gerente recebe 5%.
 */

 import java.util.Scanner;

 class SalarioBruto{
     public static void main(String vetor[]){
         double salario;
         String turno, categoria;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite o salario bruto R$ ");
         salario = read.nextDouble();
         System.out.println("Digite o turno do trabalho\nM - Matutino.\nV - Vespertino.\nN - Noturno.");
         System.out.print(">> ");
         turno = read.next();
         System.out.println("Digite a categoria.\nO - Operário.\nG - Gerente.");
         System.out.print(">> ");
         categoria = read.next();
         if(categoria.equals("O") || categoria.equals("o")){
             salario = salario + (salario * 0.02);
         }else if(categoria.equals("G") ||  categoria.equals("g")){
             salario = salario + (salario * 0.05);
         }
         if(turno.equals("M") || turno.equals("m")){
             salario = salario + (salario * 0.1);
             System.out.print("O salario bruto do funcionario e de R$ "+salario);
         }else if(turno.equals("V") || turno.equals("v")){
             salario = salario + (salario * 0.15);
             System.out.print("O salario bruto do funcionario e de R$ "+salario);
         }else if(turno.equals("N") || turno.equals("n")){
             salario = salario + (salario * 0.2);
             System.out.print("O salario bruto do funcionario e de R$ "+salario);
         }
     }
 }