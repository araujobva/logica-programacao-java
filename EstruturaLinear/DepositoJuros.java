/*
 * Problema: Faça um programa que receba o valor da poupança, o valor de um depósito e a porcentagem do rendimento
 * da poupança, calcule e mostre o valor da poupança com o seu futuro rendimento.
 */

 import java.util.Scanner;

 class DepositoJuros{
     public static void main(String[] args){
        double deposito, poupanca, rendimento;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da poupanca R$ ");
        poupanca = ler.nextDouble();
        System.out.print("Digite o valor do deposito R$ ");
        deposito = ler.nextDouble();
        poupanca = poupanca + deposito;
        System.out.print("Digite a porcentagem de rendimento mensal da poupanca >> ");
        rendimento = ler.nextDouble();
        rendimento = poupanca * (rendimento / 100);
        poupanca = poupanca + rendimento;
        System.out.print("O valor da poupanca com o rendimento mostrado e de R$ "+poupanca);
     }
 }