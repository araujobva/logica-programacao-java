/*
 * Problema: Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura 
 * em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do mais baixo, junto com suas alturas.
 */

 import java.util.Scanner;

 class AlunoAltura{
     public static void main(String[] args){
         double matriz[][] = new double[10][10];
         double numeroAlunoAlto = 0, alturaAlunoAlto = 1, numeroAlunoBaixo = 0, alturaAlunoBaixo = 9999999;
         Scanner read = new Scanner(System.in);
         for(int i = 0; i < 10; i++){
            System.out.print("Digite o numero de matricula do "+(i+1)+"º aluno >> ");
            matriz[0][i] = read.nextDouble();
            System.out.print("Digite a altura do "+(i+1)+"º aluno em centimetros >> ");
            matriz[1][i] = read.nextDouble();
            if(alturaAlunoAlto < matriz[1][i]){
                numeroAlunoAlto = matriz[0][i];
                alturaAlunoAlto = matriz[1][i];
            }
            if(alturaAlunoBaixo > matriz[1][i]){
                numeroAlunoBaixo = matriz[0][i];
                alturaAlunoBaixo = matriz[1][i];
            }
         }
         System.out.println("A matricula do aluno mais alto e "+numeroAlunoAlto+" seu tamanho e de "+alturaAlunoAlto);
         System.out.println("A matricula do aluno mais baixo e "+numeroAlunoBaixo+" seu tamanho e de "+alturaAlunoBaixo);
         read.close();
     }
 }