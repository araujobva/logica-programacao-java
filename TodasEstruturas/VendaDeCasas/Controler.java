import java.util.ArrayList;

class Controler{
    public static void cadastraImovel(Proprietario proprietario, ArrayList<Proprietario> listaProprietario){
        listaProprietario.add(proprietario);
    }

    public static void removeImovel(){

    }

    public static void removeDonoTodosImoveis(){

    }

    public static void pesquisaImovel(){
        
    }

    public static boolean fechaPrograma(boolean controlaLoop){
        //System.exit(0);
        controlaLoop = false;
        return controlaLoop;
    }
}