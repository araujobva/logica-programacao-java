//Problema: Mostre o valor de 1 a 200.

import javax.swing.JOptionPane;
import java.util.Scanner;

class Valor1A200{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        for(int i = 1; i <= 200; i++)
            System.out.println(i);
    }
}