/*
 * Problema: Crie uma simulação de um serviço de e-mail utilizando apenas o terminal, o usuário terá a opção de cadastrar um e-mail 
 * (Único, se tiver outra pessoa com o mesmo e-mail, emitir uma mensagem de erro) com uma senha e seu nome, 
 * depois de seu cadastro, ele poderá logar e ter a opções de enviar e-mail (Se o e-mail do destinatário não existir, retornar uma mensagem de erro), 
 * ver e-mails recebidos, excluir conta, mudar e-mail e senha, e sair de sua conta.
 * NOTA: Não precisa utilizar um banco de dados, utilize apenas a memória DRAM (Memória Principal) para fazer as gravações dos dados temporariamente.
 */

class Main {
    public static void main(String[] args) {
        Tela.menu();
    }
}
