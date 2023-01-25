/*
 * Problema: Faça um algoritmo para desligar em um determinado tempo dado pelo usuario 
 * um computador com sistema operacional Linux.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shutdown {
    public static void main(String[] args) {
        System.out.print("Insira o tempo de desligamento em segundos >> ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tempo = Integer.parseInt(br.readLine());
            String command = "shutdown -h +"+tempo;
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
    }
}

