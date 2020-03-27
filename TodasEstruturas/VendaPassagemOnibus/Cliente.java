class Cliente{

	private String nome[] = new String[40]; 
	private String cpf[] = new String[40];
	private boolean poltronas[] = new boolean[40];

	public void Cliente(){
		for(int i = 0; i < 40; i++){
			this.poltronas[i] = false;
		}
	}

	public String getNome(int indice){
		return this.nome[indice];
	}

	public void setNome(String nome, int indice){
		this.nome[indice] = nome;
	}

	public String getCpf(int indice){
		return this.cpf[indice];
	}

	public void setCpf(String cpf, int indice){
		this.cpf[indice] = cpf;
	}

	public boolean getPoltronas(int indice){
		return this.poltronas[indice];
	}

	public void setPoltronas(int indice, boolean venda){
		this.poltronas[indice] = venda;
	}

}
