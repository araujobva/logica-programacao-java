import java.util.ArrayList;
import java.util.Scanner;

class Tela {

    public static void menu() {
        Email objMensagem = new Email();
        Pessoa pessoa = new Pessoa();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String email, senha, mensagemEmail, destinatario, novoNomeEmail, novaSenha;
        byte op;
        boolean validacao, validacao2, controleWhile = true, controleWhile2 = true, validacaoEmail = false, envioEmail = false, validaExclusaoConta = false, validaMudancaEmail = false, validaMudancaSenha = false;;
        do {
            System.out.println("===================================================");
            System.out.println("1 - Para cadastrar uma conta.");
            System.out.println("2 - Para logar.");
            System.out.println("3 - Para sair.");
            System.out.print(">> ");
            op = read.nextByte();
            switch (op) {
                case 1:
                    System.out.print("Digite o seu e-mail >> ");
                    pessoa.setEmail(read.next());
                    validacao = GerenciaConta.validaEmail(pessoa, listaPessoas);
                    if (validacao) {
                        System.out.print("Digite a sua senha >> ");
                        pessoa.setSenha(read.next());
                        System.out.print("Digite o seu nome >> ");
                        pessoa.setNome(read.next());
                        GerenciaConta.cadastraConta(pessoa, listaPessoas);
                        System.out.println("********* SUCESSO! E-mail cadastrado com sucesso!");
                        pessoa = new Pessoa();
                    } else {
                        System.out.println("********* ERRO! Este e-mail ja esta sendo utilizado!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o e-mail >> ");
                    email = read.next();
                    System.out.print("Digite a senha >> ");
                    senha = read.next();
                    validacao2 = GerenciaConta.validaUsuario(email, senha, listaPessoas);
                    do {
                        if (validacao2) {
                            System.out.println("===================================================");
                            System.out.println("********* SUCESSO! Login efetuado! Bem Vindo " + email);
                            System.out.println("1 - Para enviar um e-mail"); 
                            System.out.println("2 - Para ver e-mails");
                            System.out.println("3 - Excluir conta");
                            System.out.println("4 - Para mudar o e-mail da conta");
                            System.out.println("5 - Para mudar a senha da conta");
                            System.out.println("6 - Para sair do seu e-mail");
                            System.out.print(">> ");
                            op = read.nextByte();
                            switch (op) {
                                case 1:
                                    System.out.print("Digite o destinarario >> ");
                                    destinatario = read.next();
                                    validacaoEmail = GerenciaConta.validaEmail(destinatario, listaPessoas);
                                    if (validacaoEmail) {
                                        System.out.print("Digite a mensagem >> ");
                                        mensagemEmail = read.next();
                                        envioEmail = GerenciaConta.enviarEmail(objMensagem, email, destinatario, mensagemEmail, listaPessoas);
                                        if(envioEmail){
                                            System.out.println("********* SUCESSO! E-mail enviado com sucesso!");
                                            objMensagem = new Email();
                                        }
                                        else 
                                            System.out.println("********* ERRO! Erro ao enviar o e-mail!");
                                    } else {
                                        System.out.println("********* ERRO! Este e-mail/destinatario nao existe!");
                                    }
                                    break;
                                case 2:
                                    GerenciaConta.listaEmails(email, listaPessoas);
                                    break;
                                case 3:
                                    validaExclusaoConta = GerenciaConta.excluirConta(email, listaPessoas);
                                    if(validaExclusaoConta) {
                                        System.out.println("********* SUCESSO! Conta excluida com sucesso!");
                                        validacao2 = false;
                                    }
                                   else
                                      System.out.println("********* ERRRO! Erro ao excluir conta!");
                                    break;
                                case 4:
                                    System.out.print("Digite o novo e-mail da conta >> ");
                                    novoNomeEmail = read.next();
                                    validaMudancaEmail = GerenciaConta.mudarEmail(novoNomeEmail, listaPessoas, email);
                                    if(validaMudancaEmail){
                                        email = novoNomeEmail;
                                        System.out.println("********* SUCESSOO! E-mail mudado com sucesso!");
                                    }else{
                                        System.out.println("********* ERRRO! Erro ao mudar o e-mail!");
                                    }
                                    break;
                                case 5:
                                    System.out.print("Digite a nova senha para sua conta >> ");
                                    novaSenha = read.next();
                                    validaMudancaSenha = GerenciaConta.mudarSenha(novaSenha, email, listaPessoas);
                                    if(validaMudancaSenha) {
                                        System.out.println("********* SUCESSOO! Senha mudada com sucesso!"); 
                                    }else {
                                        System.out.println("********* ERRRO! Erro ao mudar a senha!");
                                    }
                                    break;
                                case 6:
                                    controleWhile2 = false;
                                    break;
                                default:
                                    System.out.println("ERRO! Opção inválida!");
                            }
                        } else {
                            System.out.println("===================================================");
                            System.out.println("********* ERRO! Usuario ou Senha invalidos!");
                            controleWhile2 = false;
                        }
                    } while (controleWhile2);
                    controleWhile2 = true; 
                    break;
                case 3:
                    controleWhile = false;
                    break;
                default:
                    System.out.println("ERRO! Opcao invalida!");
            }

        } while (controleWhile);
    }

}