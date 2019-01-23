/*
 * Problema: Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério: O produto poderá ter seu preço aumentado ou diminuído. Para alterar o preço, o produto deve preencher pelo menos um dos requisitos a seguir.
 * - Se a venda média mensal for < 500 e o preço atual < R$ 30,00 o reajuste será 10% de aumento.
 * - Se a venda média mental for >= 500 e < 1.200 e o preço atual for >= R$ 30,00 e < R$ 80,00 o reajuste será de 15% de aumento.
 * - Se a venda média mensal for >=1.200 e o preço atual for >= R$ 80,00 o reajuste será de 20% de diminuição.
 * Faça um programa que receba o preço atual e a venda mensal média do produto, calcule e mostre o novo preço.
 * Se esse produto não satisfazer nem uma das proposições, mostre a mensagem "Este produto não terá reajuste."
 */

 import java.util.Scanner;

 class ReajustePreco{
     public static void main(String[] args){
         double precoAtual;
         int venda;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite o preco atual do produto R$ ");
         precoAtual = read.nextDouble();
         System.out.print("Digite a venda media deste produto mensalmente >> ");  
         venda = read.nextInt();
         if(venda < 500 && precoAtual < 30){
             precoAtual = precoAtual + (precoAtual * 0.1);
             System.out.print("O novo preco deste produto e de R$ "+precoAtual);
         }else if(venda >= 500 && venda < 1200 && precoAtual >= 30 && precoAtual < 80){
             precoAtual = precoAtual + (precoAtual * 0.15);
             System.out.print("O novo preco deste produto e de R$ "+precoAtual);
         }else if(venda >= 1200 && precoAtual >= 80){
             precoAtual = precoAtual - (precoAtual * 0.2);
             System.out.print("O novo preco deste produto e de R$ "+precoAtual);
         }else
            System.out.println("Este produto nao tera reajuste.");
     }
 }