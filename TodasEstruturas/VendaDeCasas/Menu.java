import java.util.Scanner;
import java.util.ArrayList;

class Menu{
    public static void menu(){
        System.out.println("=== Menu ===");
        System.out.println("Digite 1 - Para cadastrar um imóvel.");
        System.out.println("Digite 2 - Para remover um imóvel de um respectivo dono.");
        System.out.println("Digite 3 - Para remover um dono com todos os seus imóveis.");
        System.out.println("Digite 4 - Para pesquisar todos os imóveis de um respectivo dono.");
        System.out.println("Digite 5 - Para fechar o programa");
        System.out.print(">> ");
        Scanner read = new Scanner(System.in);
        int op;
        op = read.nextInt();
        Proprietario proprietario = new Proprietario();
        ArrayList<Proprietario> listaProprietario = new ArrayList<>();
        boolean controleLoop = true;
        do{
            switch(op){
                case 1:
                    Controler.cadastraImovel();
                    System.out.print("Digite o nome do proprietário >> ");
                    proprietario.nome = read.next();
                    System.out.print("Digite o cpf do proprietário >> ");
                    proprietario.cpf = read.next();
                    System.out.print("Digite o estado do imóvel >> ");
                    proprietario.estado = read.next();
                    System.out.print("Digite a cidade do imóvel >> ");
                    proprietario.cidade = read.next();
                    System.out.print("Digite o bairro do imóvel >> ");
                    proprietario.estado = read.next();
                    System.out.print("Digite o nome da rua do imóvel >> ");
                    proprietario.rua = read.next();
                    System.out.print("Digite o número do imóvel >> ");
                    proprietario.numero = read.nextInt();
                    proprietario.idCasa = 0; //Fazer um método para gerar automaticamente o id do imóvel.
                    proprietario.cpfProprietario = proprietario.cpf;
                    listaProprietario.add(proprietario);
                    break;
                case 2:
                    Controler.removeImovel();
                    break;
                case 3:
                    Controler.removeDonoTodosImoveis();
                    break;
                case 4:
                    controleLoop = false;
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Esta opção não é válida");
            }
        }while(controle);
    }
}