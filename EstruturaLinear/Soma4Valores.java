//Problema: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números de maneira gráfica.

import javax.swing.JOptionPane;

class Soma4Valores{
    public static void main(String[] args){
        int valor1, valor2, valor3, valor4, soma;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor inteiro"));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor inteiro"));
        soma = valor1 + valor2 + valor3 + valor4;
        JOptionPane.showMessageDialog(null,"A soma dos quatro valores e de "+soma);
    }
}