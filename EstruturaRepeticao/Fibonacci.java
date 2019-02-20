//Problema: Faça um programa que monte os trinta primeiros termos da sequência de Fibonacci.

class Fibonacci{
    public static void main(String[] args){
        int fibonacci[] = new int[30];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 1; i <= 28; i++){
            fibonacci[i + 1] = fibonacci[i] + fibonacci[i - 1]; 
        }
        for(int j = 0; j < 30; j++){
            System.out.println(fibonacci[j]);
        }
    }
}