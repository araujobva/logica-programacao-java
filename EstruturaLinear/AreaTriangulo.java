//Problema: Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Area = (base * altura) / 2.

import java.util.Scanner;

class AreaTriangulo{
    public static void main(String[] args){
        float base, altura, area;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da base do triangulo >> ");
        base = ler.nextFloat();
        System.out.print("Digite o valor da altura do triangulo >> ");
        altura = ler.nextFloat();
        area = (base * altura) / 2;
        System.out.println("A base do triangulo e de "+area);
    }
}