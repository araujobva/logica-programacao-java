/*
 * Problema: A nota final de um estudante é calculada a partir de três notas atribuidas respectivamente a um trabalho de laboratório, a uma avaliação semestral 
 * e a um exame final. A média das três notas mencionadas anteriormente obedece aos pesos a seguir: 
 * - Trabalho de Laboratório: Peso 2
 * - Avaliação semestral: Peso 3
 * - Exame final: Peso 5
 *  
 * Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue abaixo:
 * - Média ponderada de 8.0 a 10.0: Conceito A
 * - Média ponderada de 7.0 a 7.9: Conceito B
 * - Média ponderada de 6.0 a 6.9: Conceito C
 * - Média ponderada de 5.0 a 5.9: Conceito D
 * - Média ponderada de 0.0 a 4.9: Conceito E
 */

 import java.util.Scanner;

 class NotaAlunoPeso{
     public static void main(String args[]){
         double nota1, nota2, nota3, notaFinal, pesoTrabalho = 2, pesoAvaliacao = 3, pesoExameFinal = 5;
         Scanner ler = new Scanner(System.in);
         System.out.print("Digite o valor da primeira nota >> ");
         nota1 = ler.nextDouble();
         System.out.print("Digite o valor da segunda nota >> ");
         nota2 = ler.nextDouble();
         System.out.print("Digite o valor da terceira nota >> ");
         nota3 = ler.nextDouble();
         notaFinal = (nota1 * pesoTrabalho + nota2 * pesoAvaliacao + nota3 * pesoExameFinal) / (pesoTrabalho + pesoAvaliacao + pesoExameFinal);
         if(notaFinal >= 8 && notaFinal <= 10){
             System.out.println("A media ponderada e de "+notaFinal);
             System.out.println("Conceito A");
         }else if(notaFinal >= 7 && notaFinal <= 7.9){
             System.out.println("A media ponderada e de "+notaFinal);
             System.out.println("Conceito B");
         }else if(notaFinal >= 6 && notaFinal <= 6.9){
             System.out.println("A media ponderada e de "+notaFinal);
             System.out.println("Conceito C");
         }else if(notaFinal >= 5 && notaFinal <= 5.9){
             System.out.println("A media ponderada e de "+notaFinal);
             System.out.println("Conceito D");
         }else if(notaFinal >= 0 && notaFinal <= 4.9){
             System.out.println("A media ponderada e de "+notaFinal);
             System.out.println("Conceito E");
         }
     }
 }