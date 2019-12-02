/*
 * Problema: Faça um software simple para emular a venda de passagens de ônibus com 50 lugares. 
 * Nota: O software deverá ter a opção de vender e devolver a compra da passagem e mostrar todas as poltronas
 * se estão livres ou ocupadas.
 */

import java.util.Scanner;

class VendaPassagemOnibus{
    
    public static void main(String[] args){
        int op, poltrona;
        Scanner read = new Scanner(System.in);
        boolean controle = true;
        boolean[] array = new boolean[50]; 
        for(int i = 0; i < 50; i++){
            array[i] = false;
        }
        do{
            System.out.println("======================== Menu ========================");
            System.out.println("1 - Para vendar uma passagem");
            System.out.println("2 - Para devolução da compra");
            System.out.println("3 - Para ver todas as poltronas");
            System.out.println("9 - Para sair do software");
            System.out.print(">> ");
            op = read.nextInt();
            switch(op){
                case 1:
                    System.out.print("Digite o número da poltrona >> ");
                    poltrona = read.nextInt();
                    if(array[poltrona - 1]){
                        System.out.println("ERRO. Poltrona já ocupada.");
                    }else{
                        array[poltrona - 1] = true;
                        System.out.println("Poltrona registrada com sucesso.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o número da poltrona para devolução >> ");
                    poltrona = read.nextInt();
                    array[poltrona - 1] = false;
                    System.out.println("Poltrona devolvida com sucesso.");
                    break;
                case 3:
                    for(int i = 0; i < 50; i++){
                        if(array[i])
                            System.out.println("Poltrona "+(i+1)+" não disponível.");
                        else 
                            System.out.println("Poltrona "+(i+1)+" disponível");
                    }
                    break;
                case 9:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(controle);

    }

}