import java.util.Scanner;
import java.util.ArrayList;

class ManipularConta{

    public static void cadastrar(Conta conta, ArrayList<Conta> listaContas){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o numero da conta >>> ");
        conta.numeroConta = read.nextInt();
        System.out.print("Digite o nome do cliente >>> ");
        conta.nomeCliente = read.next();
        System.out.print("Digite o saldo R$ ");
        conta.saldo = read.nextDouble();
        listaContas.add(conta);
    }

    public static void buscar(ArrayList<Conta> lista){
        Scanner read = new Scanner(System.in);
        int numeroConta;
        boolean controle = false;
        System.out.print("Digite o numero da conta para pesquisa >>> ");
        numeroConta = read.nextInt();
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).numeroConta == numeroConta){
                System.out.println("Numero da conta "+lista.get(i).numeroConta);
                System.out.println("Nome "+lista.get(i).nomeCliente);
                System.out.println("Saldo R$ "+lista.get(i).saldo);
                controle = true;
            }
        }
        if(!controle)
            System.out.println("ERRO! Esta conta nao existe no nosso sistema!");
    }

    public static void excluir(ArrayList<Conta> lista){
        double menorValor = 0;
        int posMenorValor = 0, j = 0;
        menorValor = lista.get(0).saldo;
        for(int i = 0; i < (lista.size() - 1); i++){
            j++;
            if(menorValor > lista.get(j).saldo){
                menorValor = lista.get(j).saldo;
                posMenorValor = j;
            }
        }
        lista.remove(posMenorValor);
    }
}