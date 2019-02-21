//Problema: Faça um programa que que mostre os valores pares entre 1 e 100.

class ValoresPositivos{
    public static void main(String[] args){
        double resto;
        for(int i = 1; i <= 100; i++){
            resto = i % 2;
            if(resto == 0)
                System.out.println(i);
        }
    }
}