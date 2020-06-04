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

    public static boolean validaEmail(String email, ArrayList<Pessoa> listaPessoa) {
        for(int i = 0; i < listaPessoa.size(); i++) {
            if(listaPessoa.get(i).getEmail().equals(email))
                return true;
        }
        return false;
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

    public static boolean enviarEmail(Email objEmail, String emailRemetente, String destinatario, String mensagem, ArrayList<Pessoa> listaPessoas) {
        objEmail.emailRemetente = emailRemetente;
        objEmail.mensagem = mensagem;
        for(int i = 0; i < listaPessoas.size(); i++) {
            if(destinatario.equals(listaPessoas.get(i).getEmail())) {
                listaPessoas.get(i).listaEmails.add(objEmail);
                return true;
            }
        }
        return false;
    }

    public static void listaEmails(String emailUsuarioLogado, ArrayList<Pessoa> listaPessoas) {
        for(int i = 0; i < listaPessoas.size(); i++) {
            if(emailUsuarioLogado.equals(listaPessoas.get(i).getEmail())) {
                for(int j = 0; j < listaPessoas.get(i).listaEmails.size(); j++) {
                    System.out.println("******************************************************************");
                    System.out.println("ID E-mail: "+listaPessoas.get(i).listaEmails.get(j).idEmail);
                    System.out.println("E-mail remetente: "+listaPessoas.get(i).listaEmails.get(j).emailRemetente);
                    System.out.println("Mensagem: "+listaPessoas.get(i).listaEmails.get(j).mensagem);
                    System.out.println("******************************************************************");
                }
            }
        }
    }

}