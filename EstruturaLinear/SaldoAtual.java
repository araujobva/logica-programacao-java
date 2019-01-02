/* 
 * Problema: Um trabalhador recebeu seu salário e o depositou em sua conta-corrente bancária. Esse trabalhador emitiu dois cheques 
 * e agora deseja saber seu saldo atual. Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está zerado.
 */

import java.util.Scanner;

 class SaldoAtual{
     public static void main(String[] args){
        double salario, saldoConta, cheque, valorImposto, cpmf = 0.0038;
        System.out.print("Digite o valor do salario R$ ");
        Scanner read = new Scanner(System.in);
        salario = read.nextDouble();
        saldoConta = salario;
        System.out.print("Digite o valor da emissao do primeiro cheque R$ ");
        cheque = read.nextDouble();
        valorImposto = cheque * cpmf;
        saldoConta = (saldoConta - valorImposto) - cheque;
        System.out.print("Digite o valor da da emissao do segundo cheque R$ ");
        cheque = read.nextDouble();
        valorImposto = cheque * cpmf;
        saldoConta = (saldoConta - valorImposto) - cheque;   
        System.out.println("O saldo atual e de R$ "+saldoConta);
     }
 }