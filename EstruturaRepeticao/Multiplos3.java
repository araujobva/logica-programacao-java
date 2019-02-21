//Problema: Faça um programa que determine e mostre os cinco primeiros múltiplos de 3, considerando números > 0.

class Multiplos3{
    public static void main(String[] args){
        int mult = 0;
        for(int i = 0; i <= 4; i++){
            System.out.println(mult);
            mult = mult + 3;
        }
    }
}