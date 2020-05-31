import java.util.Scanner;
import java.util.ArrayList;

class Interface {
    public static void menu() {
        Scanner read = new Scanner(System.in);
        Livro livro = new Livro();
        ArrayList<Livro> listaLivros = new ArrayList<>();
        boolean controle = true;
        byte op;
        do {
            System.out.println("1 - Para catalogar um livro");
            System.out.println("2 - Para ver todos os catalogos");
            System.out.println("3 - Para sair");
            System.out.print(">> ");
            op = read.nextByte();
            if (op == 1) {
                System.out.print("Digite o nome do autor >> ");
                livro.autor = read.next();
                System.out.print("Digite o nome do livro >> ");
                livro.nome = read.next();
                listaLivros.add(livro);
                livro = new Livro();
            } else if (op == 2) {
                for (int i = 0; i < listaLivros.size(); i++) {
                    System.out.println("O nome do autor e "+listaLivros.get(i).autor);
                    System.out.println("O nome do livro e "+listaLivros.get(i).nome);
                    System.out.println("==================");
                }
            } else if (op == 3) {
                controle = false;
            } else {
                System.out.println("ERRO! Opção inválida!");
            }
        } while (controle);
    }
}
