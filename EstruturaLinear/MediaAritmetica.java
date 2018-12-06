//Problema: Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

class MediaAritmetica{
    public static void main calculaMedia(){
        float nota1, nota2, nota3, media;
        nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
        nota2 = JOptionPane.showInputDialog("Digite a segunda nota");
        nota3 = JOptionPane.showInputDialog("Digite a terceira nota");
        media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog("A média aritmética é de "+media);
    }
}