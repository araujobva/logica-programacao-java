import java.util.ArrayList;

class Pessoa{

    private String nome;
    private String senha;
    private String email;
    ArrayList<String> listaMensagem = new ArrayList<>();

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public ArrayList<String> getMensagem(){
        return this.listaMensagem;
    }

    public void setMensagem(String mensagem){
        this.listaMensagem.add(mensagem);
    }

}