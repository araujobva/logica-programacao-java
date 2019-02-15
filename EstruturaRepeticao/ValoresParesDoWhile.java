//Problema: Mostre todos os valores pares positivos até 200 com a estrutura de repetição DO-While.

class ValoresParesDoWhile{
    public static void main(String[] args)
    {
        int i = 2;
        do{
            System.out.println(i);
            i = i + 2;
        }while(i <= 200);
    }
}