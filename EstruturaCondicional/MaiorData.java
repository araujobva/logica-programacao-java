/*
 * Problema: Faça um programa que determine a data cronologicamente maior de duas datas fornecidas pelo usuário. 
 * Cada data deve ser fornecida por três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. 
 * Calcule e mostre qual pessoa é mais velha ou se elas nasceram no mesmo dia, mês e ano.
 */

 import javax.swing.JOptionPane;

 class MaiorData{
     public static void main(String args[]){
        int dia1, mes1, ano1, dia2, mes2, ano2;
        dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento da primeira pessoa."));
        mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de nascimento da primeira pessoa."));
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento da primeira pessoa."));
        dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento da segunda pessoa."));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de nascimento da segunda pessoa."));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento da segunda pessoa."));
        if(ano1 > ano2){
            JOptionPane.showMessageDialog(null,"A segunda pessoa e mais velha!");
        }else if(ano1 == ano2){
            if(mes1 > mes2){
                JOptionPane.showMessageDialog(null,"A segunda pessoa e mais velha!");
            }else if(mes1 == mes2){
                if(dia1 > dia2){
                    JOptionPane.showMessageDialog(null,"A segunda pessoa e mais velha!");
                }
            }
        }
        if(ano1 < ano2){
            JOptionPane.showMessageDialog(null,"A primeira pessoa e mais velha!");
        }else if(ano1 == ano2){
            if(mes1 < mes2){
                JOptionPane.showMessageDialog(null,"A primeira pessoa e mais velha!");
            }else if(mes1 == mes2){
                if(dia1 < dia2){
                    JOptionPane.showMessageDialog(null,"A primeira pessoa e mais velha!");
                }
            }
        }
        if(ano1 == ano2 && mes1 == mes2 && dia1 == dia2)
            JOptionPane.showMessageDialog(null,"As duas pessoas nasceram no mesmo dia, mes e ano!");
     }
 }