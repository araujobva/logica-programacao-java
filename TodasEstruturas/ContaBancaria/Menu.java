import java.util.Scanner;
import java.util.ArrayList;

class Menu{

    public static void menu(){
        Scanner read = new Scanner(System.in);
        int op;
        boolean controle = true;
        Conta conta = new Conta();
        ArrayList<Conta> listaContas = new ArrayList<>();
        do{
            System.out.println("<<< Menu >>>");
            System.out.println("1 - Cadastra contas.");
            System.out.println("2 - Visualiza informacoes de uma determinada conta.");
            System.out.println("3 - Excluir a conta com menor saldo.");
            System.out.println("4 - Sair.");
            System.out.print(">>> ");
            op = read.nextInt();
            switch(op){
                case 1:
                    conta = new Conta();
                    ManipularConta.cadastrar(conta, listaContas);
                    break;
                case 2:
                    ManipularConta.buscar(listaContas);
                    break;
                case 3:
                    ManipularConta.excluir(listaContas);
                    break;
                case 4:
                    controle = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while(controle);
    }
}