/*
 * Problema: Pedro comprou um saco de ração com peso em quilos. Pedro possui dois gatos para os quais fornece a quantidade de 
 * ração em gramas. Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada gato. 
 * Calcule e mostre quanto restará de ração no saco após cinco dias.
 */

 import javax.swing.JOptionPane;

 class RacaoGato{
     public static void main(String[] args){
        float quilos, gramas, gato1, gato2;
        quilos = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos quilos o saco possui."));
        gramas = quilos * 1000;
        gato1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de gramas que fornece para o gato 1."));
        gato2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de gramas que fornece para o gato 2. "));
        gato1 = gato1 * 5;
        gato2 = gato2 * 5;
        gramas = gramas - (gato1 + gato2);
        JOptionPane.showMessageDialog(null,"Restara ao decorrer de 5 dias "+gramas+" gramas");
     }
 }