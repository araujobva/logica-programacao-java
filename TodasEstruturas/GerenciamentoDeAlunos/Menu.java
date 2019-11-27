import java.util.Scanner;
import java.util.ArrayList;

/*
 * Problema: Faça um programa para gerenciamento de cadastro de alunos de uma escola com o seguinte menu.
 * 1 - Adiconar aluno (Deve ter o nome e o cpf do aluno).
 * 2 - Remover aluno.
 * 3 - Ver todos os alunos.
 * 4 - Ver informações de um aluno específico.
 * 5 - Para sair do programa.
 */
 
 class Menu{
    
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        Aluno aluno = new Aluno();
        ArrayList<Aluno> lista = new ArrayList<>();
        int op;
        String cpf;
        boolean controlador = true;
        do{
            System.out.println("========================  Menu ======================== ");
            System.out.print("1 - Para adicionar novo aluno.\n2 - Para Remover aluno.\n3 - Para ver todos os alunos.\n4 - Ver informação de um aluno específico.\n0 - Para sair.\n>> ");
            op = read.nextInt();
            switch(op){
                case 0:
                    controlador = false;
                    break;
                case 1: 
                    System.out.print("Digite o nome do aluno >> ");
                    aluno.nome = read.next();
                    System.out.print("Digite o cpf do aluno >> ");
                    aluno.cpf = read.next();
                    lista.add(aluno);
                    aluno = new Aluno();    
                    break;  
                case 2:
                    System.out.print("Digite o número do cpf para remover o aluno >> ");
                    cpf = read.next();
                    for(int i = 0; i < lista.size(); i++){
                        if(lista.get(i).cpf.equals(cpf)){
                            lista.remove(i);
                        }
                    } 
                    break;
                case 3:
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println(lista.get(i).nome);
                        System.out.println(lista.get(i).cpf);
                    }
                    break;
                case 4:
                    System.out.print("Digite o número do cpf para pesquisar por um aluno >> ");
                    cpf = read.next();
                    for(int i = 0; i < lista.size(); i++){
                        if(lista.get(i).cpf.equals(cpf)){
                            System.out.println("Pesquisando ... Nome = "+lista.get(i).nome+" CPF = "+lista.get(i).cpf);
                        }
                    } 
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(controlador);
    }    
 }
