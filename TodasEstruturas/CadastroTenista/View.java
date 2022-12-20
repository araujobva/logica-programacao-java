import java.util.Scanner;

class View{
    public static void view(){
        String vetorNome[] = new String[2];
        String vetorCPF[] = new String[2];
        vetorNome[0] = null;
        vetorNome[1] = null;
        vetorCPF[0] = null;
        vetorCPF[1] = null;
        String nome;
        String cpf;
        Model jogador = new Model();
        Scanner read = new Scanner(System.in);
        int op;
        boolean controle = true, verificador = true;
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
                        verificador = Controller.verificaVagaTenista(vetorNome, vetorCPF);
                        if(verificador){
                            System.out.print("Digite o nome do tenista >>> ");
                            nome = read.next();
                            System.out.print("Digite o CPF do tenista >>> ");
                            cpf = read.next();
                            if(verificador){
                                boolean verificaAdd = Controller.addTenista(vetorNome, vetorCPF, nome, cpf);
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Jogador adicionado com sucesso!");
                            }
                        }else
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Não há vagas disponíveis!");
                        break;
                    case 2:
                        for(int i = 0; i <= 1; i++){
                            System.out.print("Nome = "+vetorNome[i]+" ");
                            System.out.println("CPF = "+vetorCPF[i]);
                        }
                        break;
                    case 3:
                        boolean verif = Controller.verificaExisteTenista(vetorNome, vetorCPF);
                        if(verif){
                            System.out.print("Digite o CPF do tenista para ser excluído >>> ");
                            String cpfEx = read.next();
                            boolean verificaExclusao = Controller.excluirJogador(cpfEx, vetorNome, vetorCPF);
                            if(verificaExclusao)
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Jogador excluído com sucesso!");
                            else    
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ERRO! CPF Inválido!");
                        }else
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Não existe tenistas cadastrados!");
                        break;
                    case 4:
                        controle = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }  
        }while(controle);
    }
}
