/* 
 * Problema: Faça um programa que receba o número de horas trabalhadas e o valor do salário-mínimo. Calcule e mostre o salário a receber seguindo as regras abaixo:
 * a) A hora trabalhada vale a metade do salário-mínimo.
 * b) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
 * c) O imposto equivale a 3% do salário bruto.
 * d) O salário a receber equivale ao salário bruto menos o imposto.
 */

import java.util.Scanner;

 class SalarioFinal{
     public static void main(String[] args){
        double salarioMinimo, valorHoraTrabalhada, salarioBruto, salarioFinal;         
        int horasTrabalhas;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do salario minimo R$ ");
        salarioMinimo = read.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas R$ ");
        horasTrabalhas = read.nextInt();
        valorHoraTrabalhada = salarioMinimo / 2;
        salarioBruto = valorHoraTrabalhada * horasTrabalhas;
        salarioFinal = salarioBruto - (salarioBruto * 0.03);
        System.out.print("O salario final e de R$ "+salarioFinal);
     }
 }
 
