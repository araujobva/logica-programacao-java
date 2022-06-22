import java.util.Scanner;
import java.util.ArrayList;

class Menu{
    public static void menu(){
        Scanner read = new Scanner(System.in);
        int op;
        Proprietario proprietario = new Proprietario();
        ArrayList<Proprietario> listaProprietario = new ArrayList<>();
        boolean controlaLoop = true;
        int idCasa = 0;
        do{
            System.out.println("=== Menu ===");
            System.out.println("Digite 1 - Para cadastrar um proprietário");
            System.out.println("Digite 2 - Para cadastrar um imóvel.");
            System.out.println("Digite 3 - Para remover um imóvel de um respectivo dono.");
            System.out.println("Digite 4 - Para remover um dono com todos os seus imóveis.");
            System.out.println("Digite 5 - Para pesquisar todos os imóveis de um respectivo dono.");
            System.out.println("Digite 6 - Para fechar o programa");
            System.out.print(">> ");
            op = read.nextInt();
            switch(op){
                case 1:
                    System.out.print("Digite o nome do proprietário >> ");
                    proprietario.nome = read.next();
                    System.out.print("Digite o cpf do proprietário >> ");
                    proprietario.cpf = read.next();
                    break;
                case 2:
                    System.out.print("Digite o CPF do propriétario do imóvel a ser cadastrado >> ");
                    //verificar se o cpf existe no banco de dados
                    String cpf = read.next();
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
                    idCasa++;
                    proprietario.idCasa = idCasa; 
                    proprietario.cpfProprietario = proprietario.cpf;
                    Controler.cadastraImovel(proprietario, listaProprietario);
                    break;
                case 3:
                    Controler.removeImovel();
                    break;
                case 4:
                    Controler.removeDonoTodosImoveis();
                    break;
                case 5:
                    Controler.pesquisaImovel();
                    break;
                case 6:
                    controlaLoop = false;
                    Controler.fechaPrograma(controlaLoop);
                    break;
                default:
                    System.out.print("Esta opção não é válida");
            }
        }while(controlaLoop);
    }
}