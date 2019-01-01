//Problema: Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Area = Pi * Raio(Ao quadrado).

import java.util.Scanner;

class AreaCirculo{
    public static void main(String[] args){
        double pi = 3.1415, raio, area;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o raio do circulo >> ");
        raio = ler.nextDouble();
        area = pi * raio * raio;
        System.out.println("A area do circulo e de >> "+area);
    }
}