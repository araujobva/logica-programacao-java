/*
 * Problema: Faça um programa para controlar o estoque de mercadorias de uma empresa. Inicialmente o programa deverá ler dois vetores com cinco posições cada, 
 * onde o primeiro corresponde ao código do produto que tem que ser único e o segundo corresponde ao total desse produto em estoque. Logo após, o programa deverá ler um conjunto indeterminado de dados contendo o código de um cliente, o código do produto que este 
 * deseja comprar juntamente com a quantidade. O Código do cliente igual a zero indica o fim do programa. O programa deverá verificar.
 * - Se o código do produto solicitado existe. Se existir, tentar atender o pedido, caso contrário, exibir a mensagem "Código Inexistente".
 * - Cada pedido feito por um cliente só pode ser atendido integralmente, caso isso não seja possível, escrever a mensagem "Nâo temos estoque suficiente dessa mercadoria." Se puder atendê-lo, escrever a mensagem "Pedido atendido. Obrigado e volte sempre."
 * - Efetuar a atualização do estoque somente se o pedido for atendido integralmente.
 * - No final do programa, escrever os códigos dos produtos com seus respectivos estoques já atualizados.
 */

 class Main{
     public static void main(String[] args){
         Venda.venda();
     }
 }