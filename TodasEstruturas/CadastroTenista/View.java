import java.util.Scanner;

class View{
    public static void view(){
        String vetorPessoas[] = new String[2];
        Model jogador = new Model();
        Scanner read = new Scanner(System.in);
        int op;
        boolean controle = true;
        do{
            System.out.println("===== Menu ===== ");
            System.out.println("1 - Para adicionar um tenista");
            System.out.println("2 - Para listar todos os tenistas");
            System.out.println("3 - Para excluir um determinado tenista");
            System.out.println("4 - Para encerrar o software");
            System.out.print(">>> ");
            op = read.nextInt();
            switch(op){
                case 1:
                    System.out.print("Digite o nome do tenista >>> ");
                    vetorPessoas[0] = read.next();
                    System.out.print("Digite o CPF do tenista >>> ");
                    vetorPessoas[1] = read.next();
                case 2:
                case 3:
                case 4:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        }while(controle);
    }
}