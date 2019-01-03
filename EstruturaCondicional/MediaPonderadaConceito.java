/*
 * Problema: A nota final de um estudante é calculada a partir de três notas atribuidas respectivamente a um trabalho de laboratório, a uma avaliação 
 * semestral e a um exame final. A média das três notas mencionadas anteriormente obedece aos pesos a seguir: 
 * - Trabalho de Laboratório: Peso 2
 * - Avaliação semestral: Peso 3
 * - Exame final: Peso 5
 * Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue abaixo:
 * - Média ponderada de 8.0 a 10.0: Conceito A
 * - Média ponderada de 7.0 a 7.9: Conceito B
 * - Média ponderada de 6.0 a 6.9: Conceito C
 * - Média ponderada de 5.0 a 5.9: Conceito D
 * - Média ponderada de 0.0 a 4.9: Conceito E
 */

 import java.util.Scanner;

 class MediaPonderadaConceito{
     public static void main(String[] args){
        double notaTrabalho, notaAvaliacao, notaExameFinal,mediaPonderada;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a nota do trabalho >> ");
        notaTrabalho = read.nextDouble();
        System.out.print("Digite a nota da avaliacao >> ");
        notaAvaliacao = read.nextDouble();
        System.out.print("Digite a nota do exame final >> ");
        notaExameFinal = read.nextDouble();
        mediaPonderada = (notaTrabalho * 2 + notaAvaliacao * 3 + notaExameFinal * 5) / (10);
        if(mediaPonderada >= 8 && mediaPonderada <= 10){
            System.out.println("Valor da media ponderada e de "+mediaPonderada);
            System.out.print("Conceito A");
        }else if(mediaPonderada >= 7 && mediaPonderada <= 7.9){
            System.out.println("Valor da media ponderada e de "+mediaPonderada);
            System.out.print("Conceito B");
        }else if(mediaPonderada >= 6 && mediaPonderada <= 6.9){
            System.out.println("Valor da media ponderada e de "+mediaPonderada);
            System.out.print("Conceito C");
        }else if(mediaPonderada >= 5 && mediaPonderada <= 5.9){
            System.out.println("Valor da media ponderada e de "+mediaPonderada);
            System.out.print("Conceito D");
        }else if(mediaPonderada >= 0 && mediaPonderada <= 4.9){
            System.out.println("Valor da media ponderada e de "+mediaPonderada);
            System.out.print("Conceito E");
        }else
            System.out.println("Erro ao inserir os dados.");
     }
 }