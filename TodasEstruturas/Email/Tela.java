import java.util.ArrayList;
import java.util.Scanner;

class Tela {

    public static void menu() {
        Pessoa pessoa = new Pessoa();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        byte op;
        boolean validacao, controleWhile = true;
        int i = 0;
        do {
            System.out.println("1 - Para cadastrar uma conta.");
            System.out.println("2 - Para logar.");
            System.out.println("3 - Para sair.");
            System.out.print(">> ");
            op = read.nextByte();
            switch (op) {
                case 1:
                    System.out.print("Digite o seu e-mail >> ");
                    pessoa.setEmail(read.next());
                    validacao = GerenciaConta.validaEmail(pessoa, listaPessoas);
                    if (!validacao) {
                        System.out.println("ERRO! Este e-mail ja esta sendo utilizado!");
                    } else {
                        GerenciaConta.cadastraConta(pessoa, listaPessoas);
                    }
                    break;
                case 2:

                case 3:
                    controleWhile = false;
                    break;
                default:
                    System.out.println("ERRO! Opção inválida!");
            }

        } while (controleWhile);
    }

}