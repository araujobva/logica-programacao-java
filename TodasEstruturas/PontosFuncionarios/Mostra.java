import java.util.ArrayList;

class Mostra{
    public static void mostrar(ArrayList<Funcionario> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("============================================================================");
            System.out.println("O nome do funcionario e "+lista.get(i).getNome());
            System.out.println("A quantidade de pontos do funcionario "+lista.get(i).getNome()+" e "+lista.get(i).getPontos());
        }
    }

    public static void mostrarMedia(ArrayList<Funcionario> lista){
        double media;
        for(int i = 0; i < lista.size(); i++){
            System.out.println("============================================================================");
            media = lista.get(i).getPontos() / 3;
            System.out.println("A media do funcionario "+lista.get(i).getNome()+" e "+media);
        }    
    }

    public static void mostramaior(ArrayList<Funcionario> lista){
        int maior = -1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getPontos() > maior){
                maior = lista.get(i).getPontos();
            }
        }
        System.out.println("============================================================================");
        System.out.println("A maior pontuacao atingida foi "+maior);
        System.out.println("============================================================================");
    }

}