/* 
 * Problema: Faça um programa que receba o número de horas trabalhadas, o valor do salário-mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras a seguir.
 * a) A hora trabalhada vale 1/8 do salário-mínimo.
 * b) A hora extra vale 1/4 do salário-mínimo.
 * c) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
 * d) A quantia a receber pelas horas extras equivale ao número de horas extras tralhadas multiplicado pelo valor da hora extra.
 * e) O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.
 */

 import java.util.Scanner;

 class SalarioAReceber{
     public static void main(String[] arg){
        int horasTrabalhas, horasExtraTrabalhada;
        double salMinimo, valorHoraTrabalhada, valorHoraExtra, salBruto;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do salario minimo R$ ");
        salMinimo = ler.nextDouble();
        System.out.print("Digitei a quantidade de horas trabalhas >> ");
        horasTrabalhas = ler.nextInt();
        System.out.print("Digite a quantidade de horas extras trabalhadas >> ");
        horasExtraTrabalhada = ler.nextInt();
        valorHoraTrabalhada = salMinimo / 8;
        valorHoraExtra = salMinimo / 4;
        salBruto = valorHoraTrabalhada * horasTrabalhas;
        salBruto = salBruto + (valorHoraExtra * horasExtraTrabalhada);
        System.out.println("O salario bruto a receber e de R$ "+salBruto);
     }
 }