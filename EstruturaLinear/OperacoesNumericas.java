/* Problema: Faça um programa que receba um número positivo e maior que zero, calcule e mostre:
 * a) O número digitado ao quadrado.
 * b) O número digitado ao cubo.
 * c) A raiz quadrada do número digitado.
 * d) A raiz cúbica do número digitado.
 */

 import java.util.Scanner;

 class OperacoesNumericas{
     public static void main(String[] args){
        int valor, quadrado, cubo;
        double raizQuadrada, raizCubica;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor positivo maior que zero >> ");
        valor = ler.nextInt();
        quadrado = valor * valor;
        cubo = valor * valor * valor;
        raizQuadrada = Math.sqrt(valor);
        raizCubica = Math.cbrt(valor);
        System.out.println("O valor digitado ao quadrado e "+quadrado);
        System.out.println("O valor digitado ao cubo e "+cubo);
        System.out.println("A raiz quadrada do valor e "+raizQuadrada);
        System.out.println("A raiz cubica do valor e "+raizCubica);
     }
 }

