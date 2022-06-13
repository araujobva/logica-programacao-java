import java.util.Scanner;

class Menu{
    public static void menu(){
        System.out.println("=== Menu ===");
        System.out.println("Digite 1 - Para cadastrar um imóvel.");
        System.out.println("Digite 2 - Para remover um imóvel de um respectivo dono.");
        System.out.println("Digite 3 - Para remover um dono com todos os seus imóveis.");
        System.out.println("Digite 4 - Para pesquisar todos os imóveis de um respectivo dono.");
        System.out.print(">> ");
        Scanner read = new Scanner(System.in);
        int op;
        op = read.nextInt();
        switch(op){
            case 1:
                Controler.cadastraImovel();
                break;
            case 2:
                Controler.removeImovel();
                break;
            case 3:
                Controler.removeDonoTodosImoveis();
                break;
            case 4:
                Controler.pesquisaImovel();
                break;
            default:
                System.out.print("Esta opção não é válida");
        }
    }
}