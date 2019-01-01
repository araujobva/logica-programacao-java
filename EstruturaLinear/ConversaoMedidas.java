/* Problema: Sabe-se que:
 * 1 pé = 12 polegadas
 * 1 jarda = 3 pés
 * 1 milha = 1.760 jardas
 * Faça um programa que receba uma medida em pés, faça as conversões a seguir e mostre os resultados.
 * a) Polegadas.
 * b) Jardas.
 * c) Milhas.
 */

import java.util.Scanner;

 class ConversaoMedidas{
     public static void main(String[] args){
        double pe, polegada, jarda, milha;
        System.out.print("Digite a quantidade de pes >> ");
        Scanner ler = new Scanner(System.in);
        pe = ler.nextDouble();
        polegada = pe * 12;
        jarda = pe / 3;
        milha = 1760 / jarda;
        System.out.println("Valor em pes convertido em polegadas >> "+polegada);
        System.out.println("Valor em pes convertido em jardas >> "+jarda);
        System.out.println("Valor em pes convertido em milhas >> "+milha);
     }
 }