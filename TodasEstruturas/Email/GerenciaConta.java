import java.util.ArrayList;

public class GerenciaConta{

    public static boolean validaEmail(Pessoa pessoa, ArrayList<Pessoa> listaPessoas){
        //O sistema sempre deixará o primeiro e-mail ser cadastrado.
        if(listaPessoas.size() == 0){ 
            System.out.println(listaPessoas.size());
            return true;
        }
        for(int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getEmail().equals(pessoa.getEmail()))
                return false;
            else    
                return true;
        }
        return false;
    }

    public static void cadastraConta(Pessoa pessoa, ArrayList<Pessoa> listaPessoas){
        listaPessoas.add(pessoa);
    }

}