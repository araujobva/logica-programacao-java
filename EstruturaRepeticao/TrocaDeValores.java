/*
 * Problema: Crie um array unidimencional inteiro de 20 posições, preencha ele com os valores de 1 a 20 e troque o valor 
 * da primeira posição pela última posição, depois o valor da segunda posição pela penúltima posição e assim sucessivamente. 
 * Ao final, mostre o vetor com as  posições trocadas.
 */

 class TrocaDeValores{
     public static void main(String args[]){
         int array[] = new int[20];
         int buffer, j = 19;
         for(int i = 0; i <= 19; i++){
             array[i] = i + 1;
         }
         for(int i = 0; i <= 9; i++){
             buffer = array[i];
             array[i] = array[j];
             array[j] = buffer;
             j--;
         }
         for(int i = 0; i <= 19; i++){
             System.out.print(array[i]+" - ");
         }
     }
 }