//Problema: Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.

import javax.swing.JOptionPane;

class MediaPonderadaNotas{
    public static void main(String[] args){
        float nota1, nota2, nota3, peso1, peso2, peso3, media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota."));
        peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da primeira nota."));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota."));
        peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da segunda nota."));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota."));
        peso3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da terceira nota."));
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3); 
        JOptionPane.showMessageDialog(null,"A media pondera e de "+media);
    }
}