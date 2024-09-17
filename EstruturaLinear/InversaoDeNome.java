//Problema: Crie um algoritmo que recebe um nome e faz a inversão das letras do mesmo.

import java.util.Scanner;

class InversaoDeNome {
    public static void main(String []args) {
        String name;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o nome >>> ");
        name = read.next();
        StringBuilder data = new StringBuilder(name);
        String inversion = data.reverse().toString();
        System.out.println("\n");
        System.out.println("Nome invertido >>> "+inversion);
    }
}