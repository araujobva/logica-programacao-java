import java.util.Scanner;

class Menu{
	public static void menu(){
		byte opcao;
		boolean loop = true;
		Scanner read = new Scanner(System.in);
		Cliente onibus = new Cliente();
		byte poltrona;
		System.out.println("------------ Menu ------------");
		do{
			System.out.println("Digite 1 - Para vender uma passagem."); //Se uma passagem for vendida e o lugar estiver ocupado, emitir uma mensagem de erro.
			System.out.println("Digite 2 - Para cancelar a venda de uma passagem.");
			System.out.println("Digite 3 - Para verificar todos os lugares livres.");
			System.out.println("Digite 4 - Para verificar todos os lugares (livres e ocupados) - Livres = false e Ocupados = true.");
			System.out.println("Digite 5 - Para verificar todos os lugares ocupados.");
			System.out.println("Digite 6 - Para verificar um lugar específico."); //Se este lugar estiver ocupado, dar as informações do cliente.
			System.out.println("Digite 7 - Para desenhar o ônibus na tela, lugares ocupados vão estar como 1 e lugares vagos como 0.");
			System.out.println("Digite 8 - Para sair do software.");
			System.out.print(">> ");
			try {
				opcao = read.nextByte();
				switch(opcao){
					case 1:
						Controller.vendaPassagem(onibus);
						break;
					case 2:
						Controller.cancelaPassagemVendida(onibus);
						break;
					case 3:
						Controller.listarLugaresLivres(onibus);
						break;
					case 4:
						Controller.listaTodosLugares(onibus);
						break;
					case 5:
						Controller.listaLugaresOcupados(onibus);
						break;
					case 6:
						System.out.print("Digite o número da poltrona >> ");
						poltrona = read.nextByte();
						if(poltrona < 40){
							if(Controller.verificaPoltrona(onibus, poltrona)){
								System.out.println("Poltrona ocupada.");
								System.out.println("Ocupante "+onibus.getNome(poltrona));
								System.out.println("CPF "+onibus.getCpf(poltrona));
								System.out.println("Poltrona de número "+poltrona);
							}else{
								System.out.println("========= Poltrona desocupada.");
							}
						}else{
							System.out.println("========== ERRO! Opção inválida!");
						}
						break;
					case 7:
						Controller.desenhaOnibus(onibus);
						break;
					case 8:
						loop = false;
						break;
					default:
						System.out.println("========== ERRO! Opção Inválida!");
				}	
			} catch (Exception e) {
				System.out.println("========== ERRO! Opção Invalida! O sistema será fechado.");
				loop = false;
			}
		}while(loop);	
	}
}
