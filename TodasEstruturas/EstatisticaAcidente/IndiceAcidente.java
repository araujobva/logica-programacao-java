import java.util.ArrayList;
//import java.util.Scanner;

class IndiceAcidente{
    public static int[][] calculaIndice(ArrayList<Cidade> lista){
        int menorIndice = 999999, maiorIndice = -1, cidadeMenor = 0, cidadeMaior = 0;
        int[][] matriz = new int[2][2];
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).numeroAcidentes < menorIndice){
                menorIndice = lista.get(i).numeroAcidentes;
                cidadeMenor = lista.get(i).codCidade;
            }
            if(lista.get(i).numeroAcidentes > maiorIndice){
                maiorIndice = lista.get(i).numeroAcidentes;
                cidadeMaior = lista.get(i).codCidade;
            }
        }
        matriz[0][0] = menorIndice;
        matriz[0][1] = cidadeMenor;
        matriz[1][0] = maiorIndice;
        matriz[1][1] = cidadeMaior;
        return matriz;
    }
}