//Problema: Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário. 

import java.util.Scanner;

class AumentoSalarioFuncionario{
    public static void main(String[] args){
        double salarioAtual, percAumento, valorAumento, salarioFinal;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o salario atual >> ");
        salarioAtual = ler.nextDouble();
        System.out.print("Digite o percentual de aumento >> ");
        percAumento = ler.nextDouble();
        percAumento = percAumento / 100;
        valorAumento = salarioAtual * percAumento;
        salarioFinal = valorAumento + salarioAtual;
        System.out.println("O valor de aumento e de R$ "+valorAumento);
        System.out.print("O novo salario e de R$ "+salarioFinal);
    }
}