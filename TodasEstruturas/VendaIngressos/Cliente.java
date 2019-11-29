class Cliente{
    
    private String nome;
    private String cpf;
    private boolean vip;   
    
    String getNome(){
        return this.nome;
    }
    
    void setNome(final String nome) {
        this.nome = nome;
    }

    String getCpf() {
        return this.cpf;
    }

    void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    boolean getVip(){
        return this.vip;
    }

    void setVip(boolean vip){
        this.vip = vip;
    }
    
}
