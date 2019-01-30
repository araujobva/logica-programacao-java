/*
 * Problema: Um funcionário de uma empresa recebe aumento salarial anualemente. Sabe-se que:
 * a. Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00.
 * b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial.
 * c. A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
 * Faça um programa que determine o salário atual desse funcionário. 
 */

 import javax.swing.JOptionPane;

 class SalarioFuncionario{
     public static void main(String args[]){
         int anoAtual;
         double salario = 1000, perc = 0.015;
         anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano aual."));
         salario = salario + (salario * perc);
         for(int i = 1996; i <= anoAtual; i++){
             perc = perc * 2;
             salario = salario + (salario * perc);
         }
         JOptionPane.showMessageDialog(null,"O salario final do funcionario e de R$ "+salario,"Resultado.",JOptionPane.INFORMATION_MESSAGE);
     }
 }