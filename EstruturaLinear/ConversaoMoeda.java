/*
 * Problema: Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Essa pessoa vai passar por vários 
 * países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão 
 * é de R$ 2,00 e da libra esterlina é de R$ 1,57. O programa deve fazer as conversões e mostrá-las.
 */

 import javax.swing.JOptionPane;

 class ConversaoMoeda{
     public static void main(String[] args){
        double dolar = 1.80, marcoAlemao = 2.00, libraEsterlina = 1.57, dinheiro, convDolar, convMarcoAlemao, convLibraEsterlina;
        dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dinheiro em reais que voce possui."));
        convDolar = dinheiro / dolar;
        convMarcoAlemao = dinheiro / marcoAlemao;
        convLibraEsterlina = dinheiro / libraEsterlina;
        JOptionPane.showMessageDialog(null,"O valor de  "+dinheiro+" convertido para.\nDolar = "+convDolar+"\nMarco Alemao = "+convMarcoAlemao+"\nLibras Esterlina = "+convLibraEsterlina);
     }
 }