/*
 * Problema: Temos 2 candidatos a melhor animal de estimação, o gato e o cachorro, faz um sotware que dê a opção de votar 
 * em cada animal, o algoritmo deverá ter a opção de finalizar, e ao finalizar mostre o ganhardor:
 * NOTA: Sempre faça o gato ganhar com 60% dos votos.
 */

import javax.swing.JOptionPane;

class FraudeEleitoral{
	public static void main(String[] args){
		boolean controle = true;
		double votosCachorro = 0, votosGato = 0, totalVotos = 0;
		int op;
		do{			
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Para votar no cachorro.\n2 - Para votar no gato.\n3 - Para ver o resultado."));	
			if(op == 3){
				votosGato = totalVotos * 0.6;
				votosCachorro = totalVotos - votosGato;
				JOptionPane.showMessageDialog(null,"Gatos = "+votosGato+"\nCachorro = "+votosCachorro);
				controle = false;	
			}else if (op == 1 || op == 2){
				totalVotos++;
			}else
				JOptionPane.showMessageDialog(null,"ERRO! Voto inválido!");
		}while(controle);
	}
}	
