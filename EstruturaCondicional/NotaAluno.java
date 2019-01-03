/*
 * Problema: Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem que segue abaixo. 
 * 0,0 a 2,9 Reprovado
 * 3,0 a 6,9 Exame
 * 7,0 a 10,0 Aprovado
 */

import java.util.Scanner;

class NotaAluno{
    public static void main(String[] args){
        double nota1, nota2, nota3, mediaAritmetica;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a primeira nota >> ");
        nota1 = read.nextDouble();
        System.out.print("Digite a segunda nota >> ");
        nota2 = read.nextDouble();
        System.out.print("Digite a terceira nota >> ");
        nota3 = read.nextDouble();
        mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        if(mediaAritmetica >= 0 && mediaAritmetica <= 2.9){
            System.out.println("A media do aluno e de "+mediaAritmetica);
            System.out.print("Aluno reprovado!");
        }
        else if(mediaAritmetica >= 3 && mediaAritmetica <= 6.9){
            System.out.println("A media do aluno e de "+mediaAritmetica);
            System.out.print("Aluno ficou para exame!");
        }else if(mediaAritmetica >= 7 && mediaAritmetica <= 10){
            System.out.println("A media do aluno e de "+mediaAritmetica);
            System.out.print("Aluno aprovado!");
        }
    }
}