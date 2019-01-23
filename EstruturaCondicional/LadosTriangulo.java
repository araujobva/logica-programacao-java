/*
 * Problema: Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um triângulo, e se forem, verificar se é um triângulo equilátero, isósceles ou escaleno. 
 * Se eles não formarem um triângulo escreva uma mensagem. Considerar que:
 * - O comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.
 * - Chama-se triângulo equilátero o triângulo que tem três lados iguais.
 * - Chama-se triângulo isósceles o triângulo que tem o comprimento de dois lados iguais.
 * - Chama-se triângulo escaleno o triângulo que tem os três lados diferentes.
 */

 import java.util.Scanner;

 class LadosTriangulo{
     public static void main(String[] args){
         float x, y, z;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite o lado X >> ");
         x = read.nextFloat();
         System.out.print("Digite o lado Y >> ");
         y = read.nextFloat();
         System.out.print("Digite o lado Z >> ");
         z = read.nextFloat();
         if(x + y > z && x + z > y && y + z > x){ //Verificando se os valores digitados correspondem a um triângulo.
             if(x == y && y == z){
                 System.out.println("Triangulo equilatero.");
             }else if(x == y || x == z || y == z){
                 System.out.println("Triangulo isoceles.");
             }else if(x != y && x != z && y != z){
                 System.out.println("Triangulo escaleno.");
             }
         }else{
             System.out.println("Os valores digitados nao correspodem a um triangulo.");
         }
     }
 }