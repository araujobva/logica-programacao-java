/**
 * Problema: Foi feita uma estatística em três cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
 * a. Código da cidade.
 * b. Número de veículos de passeio (em 1999).
 * c. Número de acidentes de trânsito com vítimas (em 1999).
 * Deseja-se saber:
 * a. Qual o maior e o menor índice de acidentes de trânsito e a que cidades pertencem.
 * b. Qual a média de veículos nas três cidades juntas.
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 class Main{
     public static void main(String[] args){
         Scanner read = new Scanner(System.in);
         Cidade cidade = new Cidade();
         ArrayList<Cidade> lista = new ArrayList<>();
         for(int i = 0; i < 3; i++){
            System.out.print("Digite o codigo da cidade >> ");
            cidade.codCidade = read.nextInt();
            System.out.print("Digite o numero de viculos de passeio em 1999 >> ");
            cidade.numeroVeiculosPasseio = read.nextInt();
            System.out.print("Digite o numero de acidentes de transito em 1999 >> ");
            cidade.numeroAcidentes = read.nextInt();
            lista.add(cidade);
            cidade = new Cidade();
         }
         read.close();
         int matriz[][] = IndiceAcidente.calculaIndice(lista);
         double media = MediaVeiculos.calculaMedia(lista);
         System.out.println("O menor indice de acidente transito e "+matriz[0][0]+" que pertence a cidade "+matriz[0][1]);
         System.out.println("O maior indice de acidente transito e "+matriz[1][0]+" que pertence a cidade "+matriz[1][1]);
         System.out.println("A media de veiculos e de "+media);
     }
 }


