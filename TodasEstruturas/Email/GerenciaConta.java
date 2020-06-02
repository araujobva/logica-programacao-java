import java.util.ArrayList;

public class GerenciaConta {

    public static boolean validaEmail(Pessoa pessoa, ArrayList<Pessoa> listaPessoas) {
        // O sistema sempre deixará o primeiro e-mail ser cadastrado.
        if (listaPessoas.size() == 0) {
            return true;
        }
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getEmail().equals(pessoa.getEmail()))
                return false;
        }
        return true;
    }

    public static void cadastraConta(Pessoa pessoa, ArrayList<Pessoa> listaPessoas) {
        listaPessoas.add(pessoa);
    }

    public static boolean validaUsuario(String email, String senha, ArrayList<Pessoa> listaPessoas) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getEmail().equals(email) && listaPessoas.get(i).getSenha().equals(senha))
                return true;
        }
        return false;
    }

}