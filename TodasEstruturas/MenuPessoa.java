/*
 * Problema: Faça um menu onde a opção 1 o usuário poderá inserir o nome a idade a altura e o peso de uma pessoa, e a opção 0 mostrará o resultado.
 * - A quantidade de pessoas com idade inferior a 18 anos.
 * - A média das idades de todas a pessoas inseridas.
 * - A média das alturas de todos as pessoas do campeonato.
 * - A percentagem de pessoas com mais de 80 anos.
 */

import javax.swing.JOptionPane;

 class MenuPessoa{
     public static void main(String[] args){
        byte op;
        String nome;
        float idade, altura, peso;
        int inferior18 = 0, contPessoas = 0, contPessoas80 = 0;
        double mediaIdade, mediaAltura, idadeSomada = 0, alturaSomada = 0, percMais80Anos = 0;
        do{
            op = Byte.parseByte(JOptionPane.showInputDialog("Digite a opcao.\n1 - Inserir dados.\n0 - Mostrar resultados."));
            if(op == 1){
                contPessoas++;
                nome = JOptionPane.showInputDialog("Digite o seu nome.");
                idade = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua idade."));
                idadeSomada = idadeSomada + idade;
                if(idade < 18)
                    inferior18++; 
                else if(idade > 80)
                    contPessoas80++;
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura."));
                alturaSomada = alturaSomada + altura;
                peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso."));
            }else if(op == 0){
                JOptionPane.showMessageDialog(null,"Existem "+inferior18+" pessoas com idade inferior a 18 anos.");
                mediaIdade = idadeSomada / contPessoas;
                mediaAltura = alturaSomada / contPessoas;
                percMais80Anos = contPessoas80 / contPessoas;
                JOptionPane.showMessageDialog(null,"A media das idade de todas as pesoas inseridas e de "+mediaIdade);
                JOptionPane.showMessageDialog(null,"A media da altura de todas as pessoas inseridas e de "+mediaAltura);
                JOptionPane.showMessageDialog(null,"A percentagem de pessoas com mais de 80 anos e de "+percMais80Anos);
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Opcao invalida.","Erro.",JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
     }
 }