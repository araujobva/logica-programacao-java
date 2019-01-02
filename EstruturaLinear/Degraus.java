/*
 * Problema: Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o usuário 
 * deseja alcançar subindo a escada. Calcule e mostre quantos degraus o usuário deverá subir para atingir seu objetivo, sem se 
 * preocupar com a altura do usuário.
 */

 import java.util.Scanner;

 class Degraus{
     public static void main(String[] args){
         float alturaDegrau, alturaDesejada, quantDegraus;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite a altura do degrau >> ");
         alturaDegrau = read.nextFloat();
         System.out.print("Digite a altura desejada >> ");
         alturaDesejada = read.nextFloat();
         quantDegraus = alturaDesejada / alturaDegrau;
         System.out.println("O usuario devera subir "+quantDegraus+" para alcancar seu objetivo.");
     }
 }