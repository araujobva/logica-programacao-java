
/*
 * Problema: Sabe-se que o quilowatt de energia custa um quinto do salário-mínimo. Faça um programa que receba o valor do salário-mínimo e a quantidade de quilowatts consumida por uma residência. 
 * Calcule e mostre:
 * a) O valor, em reais, de cada quilowatt.
 * b) O valor, em reais, a ser pago por essa residência.
 * c) O valor, em reais, a ser pago com desconto de 15%.
 */

import java.util.Scanner;

 class CalculoQuilowatt{
    public static void main(String[] args){
        double salMinimo, valorWatts, quantWattsConsumida, valorFinal, valorFinalDesconto;
        System.out.print("Digite o valor do salario minimo R$ ");
        Scanner read = new Scanner(System.in);
        salMinimo = read.nextDouble();
        valorWatts = salMinimo / 5;
        System.out.print("Digite a quantidade de quilowatts consumida por esta residencia >> ");
        quantWattsConsumida = read.nextDouble();
        valorFinal = valorWatts * quantWattsConsumida;
        valorFinalDesconto = valorFinal - (valorFinal * 0.15);
        System.out.println("O valor de cada quilowatt e de R$ "+valorWatts);
        System.out.println("O valor a ser pago e de R$ "+valorFinal);
        System.out.println("O valor a ser pago com desconto de 15% e de R$ "+valorFinalDesconto);
     }
 }
