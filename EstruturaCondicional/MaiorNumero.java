//Problema: Faça um programa que receba dois número e mostre o maior.

import javax.swing.JOptionPane;

class MaiorNumero{
    public static void main(String[] args){
        float valor1, valor2;
        valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor."));
        valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor. "));
        if(valor1 > valor2)
            JOptionPane.showMessageDialog(null,"O primeiro valor digitado e o maior.");
        else if(valor1 < valor2)
            JOptionPane.showMessageDialog(null,"O segundo valor digitador e o maior.");
    }
}