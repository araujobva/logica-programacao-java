//Problema: Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

import javax.swing.JOptionPane;

class AumentoSalario{
    public static void main(String[] args){
        double salario, novoSalario, percAumento = 0.25;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionario."));
        novoSalario = (salario * percAumento) + salario;
        JOptionPane.showMessageDialog(null,"O novo salario e de "+novoSalario);
    }
}