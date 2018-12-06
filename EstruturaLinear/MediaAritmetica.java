//Problema: Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

import javax.swing.JOptionPane;

class MediaAritmetica{
    public static void main (String[] args){
        float nota1, nota2, nota3, media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));
        media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null,"A media aritmetica e de "+media);
    }
}