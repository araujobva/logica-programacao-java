//Problema: Faça um programa que receba 2 números maiores que zero e inteiros, calcule e mostre um elevado ao outro.

import javax.swing.JOptionPane;

class ValorElevado{
    public static void main(String[] array){
        int valor1, valor2, result1, result2;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor maior que zero e inteiro."));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor maior que zero e inteiro."));
        result1 = valor1;
        result2 = valor2;
        for(int i = 1; i < valor1; i++)
            result2 = valor2 * result2;
        for(int i = 1; i < valor2; i++)
            result1 = valor1 * result1;
        JOptionPane.showMessageDialog(null,result2);
        JOptionPane.showMessageDialog(null,result1);
    }
}