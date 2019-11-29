import java.util.Scanner;
import java.util.ArrayList;

class Menu{

    public static void menu(){
        int op, vipNormal;
        boolean controle = true, venda = true;
        String cpf;
        Scanner read = new Scanner(System.in);
        Cliente cliente = new Cliente();
        ArrayList<Cliente> lista = new ArrayList<>();
        do{
            System.out.print("-------------------------- Menu --------------------------");
            System.out.print("\n1 - Vender um ingresso\n2 - Devolução do ingresso\n3 - Verificar um ingresso específico\n4 - Verificar todos os ingressos vendidos\n5 - Sair do software\n>> ");
            op = read.nextInt();
            switch(op){
                case 1:
                    System.out.print("Digite o nome do comprador >> ");
                    cliente.setNome(read.next());
                    System.out.print("Digite o CPF do comprador >> ");
                    cliente.setCpf(read.next());
                    System.out.print("Digite 1 para ingresso VIP e 9 para ingresso normal >> ");
                    vipNormal = read.nextInt();
                    if(vipNormal == 1)
                        cliente.setVip(true);
                    else if(vipNormal == 9)
                        cliente.setVip(false);
                    else{
                        System.out.println("Opção inválida. A venda não foi efetuada.");
                        venda = false;
                    }
                    if(venda){
                        lista.add(cliente);
                        cliente = new Cliente();
                        System.out.println("Venda efeutada com sucesso.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o CPF do cliente que você deseja remover >> ");
                    cpf = read.next();
                    for(int i = 0; i < lista.size(); i++){
                        if(cpf.equals(lista.get(i).getCpf()))
                            lista.remove(i);
                    }
                    break;
                case 3:
                    System.out.print("Digite o CPF para pesquisar >> ");
                    cpf = read.next();
                    for(int i = 0; i < lista.size(); i++){
                        if(cpf.equals(lista.get(i).getCpf())){
                            System.out.println("Nome = "+lista.get(i).getNome());
                            System.out.println("CPF = "+lista.get(i).getCpf());
                            if(lista.get(i).getVip() == true)
                                System.out.print("O ingresso é VIP");
                            else 
                                System.out.print("O ingresso não é VIP");
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Nome = "+lista.get(i).getNome());
                        System.out.println("CPF = "+lista.get(i).getCpf());
                        if(lista.get(i).getVip() == true)
                        System.out.println("O ingresso é VIP");
                    else 
                        System.out.println("O ingresso não é VIP");
                        System.out.println("==========================================================");
                    }
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }           
        }while(controle);
    }
    
}
