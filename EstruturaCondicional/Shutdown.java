/*
 * Problema: Faça um algoritmo para desligar em um determinado tempo dado pelo usuario 
 * um computador com sistema operacional Linux.
 */

import java.util.Scanner;

public class Shutdown {
    public static void main(String[] args) {
        System.out.print("Insira o tempo de desligamento em segundos >> ");
        try {
            Scanner read = new Scanner(System.in);
            String tempo = read.nextLine();
            String command = "shutdown -h " + tempo;
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
    }
}


