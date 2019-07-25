/**
 * Problema: Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 5 pessoas. Faça um programa que calcule e mostre:
 * a. A maior e a menor altura do grupo.
 * b. A média de altura das mulheres.
 * c. O número de homens.
 * d. O sexo da pessoa mais alta.
 * e. No final, mostre todos os dados das pessoas inseridas.
 */

 import java.util.Scanner;

 class OperacoesAlturaSexo{
     public static void main(String[] vetor){
        Scanner read = new Scanner(System.in);
        String[] sexo = new String[5];
        double[] altura = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o sexo da pessoa M ou F >> ");
            sexo[i] = read.next();
            System.out.print("Digite a altura >> ");
            altura[i] = read.nextDouble();
        }
        maiorMenorAltura(sexo, altura);
        mediaAlturaMulheres(sexo, altura);
        quantHomens(sexo);
        pessoaMaisAlta(sexo, altura);
        mostraDados(sexo, altura);
     }

     public static void maiorMenorAltura(String[] sexo, double[] altura){ //Calcula a maior e a menor altura do grupo.
        double maiorAltura = 0, menorAltura = 999999;
        for(int i = 0; i < 5; i++){
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }
        System.out.println("A maior altura digitada e "+maiorAltura);
        System.out.println("A menor altura digitada e "+menorAltura);
     }

     public static void mediaAlturaMulheres(String[] sexo, double[] altura){ //Calcula a média de altura das mulheres.
         int cont = 0; 
         double media = 0;
         for(int i = 0; i < 5; i++){
             if(sexo[i].equals("F") || sexo[i].equals("f")){
                media = media + altura[i];
                cont++;
             }
         }
         media = media / cont;
         System.out.println("A media da altura de todas as mulheres e de "+media);
     }

     public static void quantHomens(String[] sexo){ //Calcula a quantidade de homens.
        int cont = 0;
        for(int j = 0; j < 5; j++){
            if(sexo[j].equals("F") || sexo[j].equals("m")){
                cont++;
            }
        }
        System.out.println("A quantidade de homens e de "+cont);
     }

     public static void pessoaMaisAlta(String[] sexo, double[] altura){ //Calcula o sexo da pessoa mais alta.
        double pessoaMaisAlta = 0;
        String genero = "Error";
        for(int j = 0; j < 5; j++){
            if(altura[j] > pessoaMaisAlta){
                genero = sexo[j];
                pessoaMaisAlta = altura[j];
            }
        }
        System.out.println("O sexo da pessoa mais alta e "+genero);
     }

     public static void mostraDados(String[] sexo, double[] altura){ //Mostra todos os dados das pessoas inseridas.
        System.out.println("--- Mostrando todos os dados digitados pelo usuario ---");
        for(int i = 0; i < 5; i++){
            System.out.println(""+sexo[i]+" "+altura[i]);
        }
     }

 }