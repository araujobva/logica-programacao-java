import java.util.ArrayList;

class MediaVeiculos{
    public static double calculaMedia(ArrayList<Cidade> lista){
        double media = 0;
        for(int i = 0; i < lista.size(); i++){
            media = media + lista.get(i).numeroVeiculosPasseio;
        }
        return media = media / lista.size();
    }
}