/*
 * Problema: Faça um programa que leia cinco pares de valores (a, b), todos inteiros e positivos, um de cada vez. 
 * Mostre os números inteiros pares de a até b (inclusive).
 */

 import java.util.Scanner;

 class ValoresPares{
     public static void main(String args[]){
         Scanner read = new Scanner(System.in);
         int array[] = new int[10];
         for(int i = 0; i <= 9; i++){
             System.out.print("Digite o "+(i+1)+" valor do vetor >> ");
             array[i] = read.nextInt();
         }
         for(int i = 0; i <= 9; i++){
             if(array[i] % 2 == 0)
                System.out.println(array[i]);
         }
     }
 }