import java.util.Scanner;
import java.util.ArrayList;

class Menu{
    public static void menu(){
        boolean controle = true;
        int op = 1;
        Funcionario funcionario = new Funcionario();
        ArrayList<Funcionario> lista = new ArrayList<>();
        Scanner leiaTerminal = new Scanner(System.in);
        do{
            System.out.println("+++ Menu +++");
            System.out.print("Digite o nome do querido funcionario >> ");
            funcionario.setNome(leiaTerminal.next());
            System.out.print("Digite a pontuacao dos 3 meses do funcionario >> ");
            funcionario.setPontos(leiaTerminal.nextInt());
            if(op == 1){
                controle = true;
                lista.add(funcionario);
                funcionario = new Funcionario();
            }
            System.out.print("Digite 1 para inserir mais funcionarios.\nDigite 2 para ver os resultados >> ");
            op = leiaTerminal.nextInt();
            if(op == 2){
                Mostra.mostrar(lista);
                Mostra.mostrarMedia(lista);
                Mostra.mostramaior(lista);
                controle = false;
            }
        }while(controle);
        leiaTerminal.close();
    }
}