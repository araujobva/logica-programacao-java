/*
 * Problema: Crie uma classe Televisão que tem os atributos necessários para permitir o controle de volume e os canais. Um usuário pode controlar o volume e trocar os canais da televisão. As ações que podem ser feitas são:
 * - Aumentar ou diminuir a potência do volume do som em uma unidade de cada vez.
 * - Aumentar ou diminuir o número do canal em uma unidade.
 * - Trocar para um canal indicado.
 * - Consultar o valor do volume de som e o canal selecionado.
 * - Adicione na classe Televisão os métodos necessários para fazer as ações descritas.
 */

 import javax.swing.JOptionPane;

 class Televisao{

     int volume = 0;
     int canal = 1;

     public static void main(String[] args){
         int op;
         Televisao controle = new Televisao();
         do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada.\n1 - Volume.\n2 - Canal.\n3 - Consultar volume e canal.\n4 - Para encerrar o programa."));
            switch(op){
                case 1:
                    controle.volume();
                    break;
                case 2: 
                    controle.canal();
                    break;
                case 3:
                    controle.consultar();
                    break;
                case 4:
                    //Sai do switch para encerrar o loop.
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Parametro invalido.","Erro!",JOptionPane.ERROR_MESSAGE);
            }
         }while(op != 4);
     }

     public void volume(){
         int op;
         op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada.\n1 - Aumentar o volume.\n2 - Diminuir o volume."));
         if(op == 1)
            this.volume++;
        else if(op == 2)
            this.volume--;
        else
            JOptionPane.showMessageDialog(null,"Parametro invalido.","Erro!",JOptionPane.ERROR_MESSAGE);
     }

    public void canal(){
         int op;
         op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada.\n1 - Aumentar o canal.\n2 - Diminuir o canal.\n3 - Para inserir um canal especifico."));
         if(op == 1)
            this.canal++;
        else if(op == 2)
            this.canal--;
        else if (op == 3)
            this.canal = Integer.parseInt(JOptionPane.showInputDialog("Digite o canal desejado."));
        else
            JOptionPane.showMessageDialog(null,"Parametro invalido.","Erro!",JOptionPane.ERROR_MESSAGE);    
    }

    public void consultar(){
        JOptionPane.showMessageDialog(null,"O volume e "+this.volume+"\nO canal e "+this.canal);
    }

 }