/*
 * Problema: Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opçõao desejada, receba os dados necessários para executar a operação 
 * e mostre o resultado. Verifique se as possibilidade de opção é válida. 
 * Menu de opções:
 * 1. Imposto.
 * 2. Novo Salário.
 * 3. Classificação.
 *
 * Na Opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir.
 * - Se os salário for menor que R$ 500,00 o percentual do imposto será 5%.
 * - Se o salário igual a R$ 500,00 a R$ 849,00 o percentual do imposto será 10%.
 * - Igual ou acima de R$ 850,00 o percentual será de 15%.
 *
 * Na opção 2: Receber o salário de um funcionário, calcular e mostrar o valor do novo salário, usando as regras abaixo:
 * - Maiores que R$ 1.500,00 aumento de R$ 25,00.
 * - De R$ 750,00 (inclusive) a R$ 1.500,00 (inclusive) aumento de R$ 50,00.
 * - De R$ 450,00 (inclusive) a R$ 750,00 aumento de 75,00.
 * - Menores que R$ 450,00 aumento de R$ 100,00.
 * 
 * Na opção 3: Receber o salário de um funcionário e mostrar sua classificação usando a tabela abaixo.
 * - Salário até R$ 700,00 (inclusive) a classifação será Mal remunerado.
 * - Salário maio que R$ 700,00 a classificação será Bem remunerado.
 */

 import javax.swing.JOptionPane;

class CalculoImpostoSalarioClassificacao{
     public static void main(String args[]){
        int op;
        double salario, imposto;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada\n1 - Calcular imposto.\n2 - Calcular novo salario.\n3 - Calcular classificacao."));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario R$"));
        switch(op){
            case 1:
                if(salario < 500){
                    imposto  = salario * 0.05;
                    JOptionPane.showMessageDialog(null,"O imposto para ser pago e de R$ "+imposto,"Valor do imposto.",JOptionPane.INFORMATION_MESSAGE);
                }else if (salario == 500 && salario <= 849){
                    imposto = salario * 0.01;
                    JOptionPane.showMessageDialog(null,"O imposto para ser pago e de R$ "+imposto,"Valor do imposto.",JOptionPane.INFORMATION_MESSAGE);
                }else if(salario > 849){
                    imposto = salario * 0.15;
                    JOptionPane.showMessageDialog(null,"O imposto para ser pago e de R$ "+imposto,"Valor do imposto.",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case 2:
                if(salario > 1500){
                    salario = salario + 25;
                    JOptionPane.showMessageDialog(null,"O valor do novo salario e de "+salario,"Salario final.",JOptionPane.INFORMATION_MESSAGE);
                }else if(salario >= 750 && salario <= 1500){
                    salario = salario + 50;
                    JOptionPane.showMessageDialog(null,"O valor do novo salario e de "+salario,"Salario final.",JOptionPane.INFORMATION_MESSAGE);
                }else if(salario >= 450 && salario < 750){
                    salario = salario + 75;
                    JOptionPane.showMessageDialog(null,"O valor do novo salario e de "+salario,"Salario final.",JOptionPane.INFORMATION_MESSAGE);
                }else if(salario < 450){
                    salario = salario + 100;
                    JOptionPane.showMessageDialog(null,"O valor do novo salario e de "+salario,"Salario final.",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case 3:
                if(salario <= 700)
                    JOptionPane.showMessageDialog(null,"Mal remunerado","Remuneracao.",JOptionPane.INFORMATION_MESSAGE);
                else if(salario > 700)
                    JOptionPane.showMessageDialog(null,"Bem remunerado","Remuneracao",JOptionPane.INFORMATION_MESSAGE);
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida.","Erro.",JOptionPane.ERROR_MESSAGE);
        }
    }
}