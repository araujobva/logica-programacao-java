/*
 * Problema: Faça um programa com 2 opções para o usuário, OK e CANCELAR, quando o usuário clicar em uma das opções, mostrar no console a opção que ele clicou.
 */

import javax.swing.JOptionPane;

public class OkCancelar {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Escolha uma opcao!", "OPCAO!", JOptionPane.OK_CANCEL_OPTION);
        if (resposta == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Voce clicou em OK!");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Voce clicou em Cancelar!");
        }
    }
}

