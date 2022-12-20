class Controller {
	public static boolean verificaVagaTenista(String vetorNome[], String vetorCPF[]) {
		for (int i = 0; i <= 1; i++) {
			if (vetorNome[i] == null && vetorCPF[i] == null) {
				return true;
			}
		}
		return false;
	}

	public static boolean addTenista(String vetorNome[], String vetorCpf[], String nome, String cpf) {
		byte posicaoVaga = posicaoVagaTenista(vetorNome, vetorCpf);
		vetorNome[posicaoVaga] = nome;
		vetorCpf[posicaoVaga] = cpf;
		return true;
	}

	public static byte posicaoVagaTenista(String nome[], String cpf[]) {
		for (byte i = 0; i <= 1; i++) {
			if (nome[i] == null && cpf[i] == null) {
				return i;
			}
		}
		return 0;
	}

	public static boolean excluirJogador(String cpf, String vetorNome[], String vetorCPF[]){
	try {
		for(int i = 0; i <= 1; i++){
			if(vetorCPF[i].equals(cpf)){
				vetorNome[i] = null;
				vetorCPF[i] = null;
				return true;
			}
		}
	} catch (Exception e) {
		return false;
		// TODO: handle exception
	}
		return false;

	}

	public static boolean verificaExisteTenista(String vetorNome[], String vetorCPF[]){
		for(int i = 0; i <= 1; i++){
			if(vetorNome[i] != null && vetorCPF[i] != null){
				return true;
			}
		}
		return false;
	}
}
