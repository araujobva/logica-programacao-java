/*
 * Problema: Faça um programa que receba o preço, o tipo (A - Alimentação, L - Limpeza e V - Vestuário) e a refrigeraçaõ (S - Produto que necessita de refrigeração e N - Produto que não necessita de refrigeração) de um produto. 
 * Calcule e mostre o valor final de acordo com as regras abaixo:
 * 
 * SE NÃO PRECISAR DE REFRIGERAÇÃO:
 * - Tipo A se for menor que R$ 15.00 valor adicional R$ 2.00 se for maior ou igual a R$ 15.00 valor adicional R$ 5.00.
 * - Tipo L se for menor que R$ 10.00 valor adicional R$ 1.50 se for maior ou igual a R$ 10.00 valor adicional R$ 2.50.
 * - Tipo V se for menor que R$ 30.00 valor adicional R$ 3.00 se for maior ou igual a R$ 30.00 valor adicional R$ 2.50.
 *  
 * SE PRECISAR DE REFRIGERAÇÃO:
 * - Tipo A valor adicional de R$ 8.00.
 * - Tipo L valor adicional de R$ 0.00.
 * - Tipo V valor adicional de R$ 0.00.
 */

 import javax.swing.JOptionPane;

 class PrecoProdutoRefrigeracao{
     public static void main(String[] args){
         double preco;
         String tipo, refrigeracao;
         preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto."));
         tipo = JOptionPane.showInputDialog("Digite o tipo do produto.\nA - Alimentacao\nL - Limpeza.\nV - Vestuario.");
         refrigeracao = JOptionPane.showInputDialog("Digite S se precisar de refrigeracao e N se nao precisar.");
         if(refrigeracao.equals("S") || refrigeracao.equals("s")){
             if(tipo.equals("A") || tipo.equals("a")){
                 preco = preco + 8.00;
                 JOptionPane.showMessageDialog(null,"O novo preco do produto e de R$ "+preco);
             }else{
                 JOptionPane.showMessageDialog(null,"O novo preco do produto e de R$ "+preco);
             }
         }else{
             if(tipo.equals("A") || tipo.equals("a")){
                 if(preco < 15){
                     preco = preco + 2.00;
                 }else{
                     preco = preco + 5.00;
                 }
                JOptionPane.showMessageDialog(null,"O novo preco do produto e de R$ "+preco);
             }
             if(tipo.equals("L") || tipo.equals("l")){
                 if(preco < 10){
                     preco = preco + 1.50;
                 }else{
                     preco = preco + 2.50;
                 }
                JOptionPane.showMessageDialog(null,"O novo preco do produto e de R$ "+preco);
             }
            if(tipo.equals("V") || tipo.equals("v")){
                if(preco < 30){
                    preco = preco + 3.00;
                }else{
                    preco = preco + 2.50;
                }
                JOptionPane.showMessageDialog(null,"O novo preco do produto e de R$ "+preco);
            }
         }
     }
 }