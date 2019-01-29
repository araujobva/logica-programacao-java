/*
 * Problema: Faça um programa que receba:
 * - O código do estado de origem de carga de um caminhão, supondo que a digitação do código do estado seja sempre válida, ou seja, um número inteiro entre 1 e 5.
 * - O peso da carga do caminhão em toneladas.
 * - O código da carga, supondo que a digitação do código da carga seja sempre válida, ou seja, um número inteiro entre 10 e 40.
 * 
 * ----------------
 * Código do estado
 * ----------------
 * - Se o código do estado for 1 o imposto será de 35%.
 * - Se o código do estado for 2 o imposto será de 25%.
 * - Se o código do estado for 3 o imposto será de 15%.
 * - Se o código do estado for 4 o imposto será de 5%.
 * - Se o código do estado for 5 o imposto será de Isento.
 * 
 * ---------------
 * Código da carga
 * ---------------
 * - 10 a 20 toneladas o preço do quilo será de R$ 100,00.
 * - 21 a 30 toneladas o preço do quilo será de R$ 250,00.
 * - 31 a 40 toneladas o preço do quilo será de R$ 340,00.
 * 
 * Calcule e mostre:
 * - O peso da carga do caminhão convertido em quilos.
 * - O preço da carga do caminhão.
 * - O valor do imposto, sabendo-se que o imposto é cobrado sobre o preço da carga do caminhão e que depende do estado de origem.
 * - O valor total transportado pelo caminhão, carga mais imposto.
 */

 import java.util.Scanner;

 class CargaCaminhao{
     public static void main(String[] args){
         Scanner read = new Scanner(System.in);
         int codOrigem, codCarga; 
         double pesoTon, pesoQuilos, valorCarga = 0, valorImposto, valorCargaSemImposto;
         System.out.print("Digite o codigo de origem do caminhao que e entre 1 e 5 >> ");
         codOrigem = read.nextInt();
         System.out.print("Digite o peso da carga do caminhao em toneladas >> ");
         pesoTon = read.nextDouble();
         System.out.print("Digite o codigo da carga que e entre 10 e 40 >> ");
         codCarga = read.nextInt();
         pesoQuilos = pesoTon * 1000;
         if(codCarga >= 10 && codCarga <= 20){
             valorCarga = pesoQuilos * 100;
         }else if(codCarga >= 21 && codCarga <= 30){
             valorCarga = pesoQuilos * 250;
         }else if(codCarga >= 31 && codCarga <= 40){
             valorCarga = pesoQuilos * 340;
         }else{
             System.out.print("Valor invalido!");
         }
         if(codOrigem == 1){
             valorImposto = valorCarga * 0.35;
             valorCargaSemImposto = valorCarga;
             valorCarga = valorCarga + valorImposto;
             System.out.println("O peso em quilos e de >> "+pesoQuilos);
             System.out.println("O preco da carga do caminhao e de R$ "+valorCargaSemImposto);
             System.out.println("O valor do imposto e de R$ "+valorImposto);
             System.out.println("O valor total transportado pelo caminhao mais imposto e de R$ "+valorCarga);
         }
        else if(codOrigem == 2){
             valorImposto = valorCarga * 0.25;
             valorCargaSemImposto = valorCarga;
             valorCarga = valorCarga + valorImposto;
             System.out.println("O peso em quilos e de >> "+pesoQuilos);
             System.out.println("O preco da carga do caminhao e de R$ "+valorCargaSemImposto);
             System.out.println("O valor do imposto e de R$ "+valorImposto);
             System.out.println("O valor total transportado pelo caminhao mais imposto e de R$ "+valorCarga);
        }
        else if(codOrigem == 3){
             valorImposto = valorCarga * 0.15;
             valorCargaSemImposto = valorCarga;
             valorCarga = valorCarga + valorImposto;
             System.out.println("O peso em quilos e de >> "+pesoQuilos);
             System.out.println("O preco da carga do caminhao e de R$ "+valorCargaSemImposto);
             System.out.println("O valor do imposto e de R$ "+valorImposto);
             System.out.println("O valor total transportado pelo caminhao mais imposto e de R$ "+valorCarga);
        }
        else if(codOrigem == 4){
             valorImposto = valorCarga * 0.05;
             valorCargaSemImposto = valorCarga;
             valorCarga = valorCarga + valorImposto;
             System.out.println("O peso em quilos e de >> "+pesoQuilos);
             System.out.println("O preco da carga do caminhao e de R$ "+valorCargaSemImposto);
             System.out.println("O valor do imposto e de R$ "+valorImposto);
             System.out.println("O valor total transportado pelo caminhao mais imposto e de R$ "+valorCarga);
        }
        else if(codOrigem == 5){
             valorImposto = valorCarga * 0;
             valorCargaSemImposto = valorCarga;
             valorCarga = valorCarga + valorImposto;
             System.out.println("O peso em quilos e de >> "+pesoQuilos);
             System.out.println("O preco da carga do caminhao e de R$ "+valorCargaSemImposto);
             System.out.println("O valor do imposto e de R$ "+valorImposto);
             System.out.println("O valor total transportado pelo caminhao mais imposto e de R$ "+valorCarga);
        }
     }
 }