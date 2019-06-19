/*
 * Problema: O cardápio de uma lanchonete é o seguinte:
 * - Cachorro quente. Código 100. Preço R$ 1,20.
 * - Bauru. Código 101. Preço R$ 1,30.
 * - Refrigerante. Código 102. Preço R$ 1,00.
 * Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. 
 * Considere que o cliente deve informar quando o pedido deve ser encerrado.
 * Se o código do pedido inserido não existir, mostrar a mensagem "Código de item inválido."
 */

 import java.util.Scanner;
 
class Lanchonete{
    public static void main(String args[]){
        int op = 1, codCachorroQuente = 100, codBauru = 101, codRefrigerante = 102, contCachorroQuente = 0, contBauru = 0, contRefrigerante = 0, cod;
        double valorCachorroQuente = 1.20, valorBauru = 1.30, valorRefrigerante = 1.00, valorTotalCachorroQuente, valorTotalBauru, valorTotalRefrigerante, valorTotal;
        Scanner read = new Scanner(System.in);
        do{
            System.out.print("Digite o codigo do item do pedido >>> ");
            cod = read.nextInt();
            if(cod == 100)
                contCachorroQuente++;
            else if(cod == 101)
                contBauru++;
            else if(cod == 102)
                contRefrigerante++;
            else 
                System.out.println("Codigo de item invalido.");
            System.out.print("Digite o valor 1 inserir mais dados e o valor 0 para encerrar o programa >>> ");
            op = read.nextInt();
            if(op == 1)
                continue;
            else if(op == 0)
                break;
        }while(true);
        valorTotalCachorroQuente = valorCachorroQuente * contCachorroQuente;
        valorTotalBauru = valorBauru * contBauru;
        valorTotalRefrigerante = valorRefrigerante * contRefrigerante;
        valorTotal = valorTotalCachorroQuente + valorTotalBauru + valorTotalRefrigerante;
        System.out.println("O valor total a ser pago pelo cachorro quente e de R$ "+valorTotalCachorroQuente);
        System.out.println("O valor total a ser pago pelo lanche Bauru e de R$ "+valorTotalBauru);
        System.out.println("O valor total a ser pago pelo refrigerante e de R$ "+valorTotalRefrigerante);
        System.out.println("O valor total a ser pago pela conta e de R$ "+valorTotal);
    }
}