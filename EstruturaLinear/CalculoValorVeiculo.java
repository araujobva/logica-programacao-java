/* 
 * Problema: O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. 
 * Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos. Calcule e mostre:
 * a) O valor correspondente ao lucro do distribuidor.
 * b) O valor correspondente aos impostos.
 * c) O preço final do veículo.
 */

 import javax.swing.JOptionPane;

 class CalculoValorVeiculo{
     public static void main(String[] args){
         double precoFabrica, percDistribuidor, percImposto, lucroDistribuidor, valorImpostos, precoFinal;
         precoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do preco de fabrica."));
         percDistribuidor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de percentual de lucro do distribuidor."));
         percImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de imposto."));
         lucroDistribuidor = precoFabrica * (percDistribuidor / 100);
         valorImpostos = precoFabrica * (percImposto / 100);
         precoFinal = precoFabrica + lucroDistribuidor + valorImpostos;
         JOptionPane.showMessageDialog(null,"Lucro do distribuidor R$ "+lucroDistribuidor+"\nValor dos impostos R$ "+valorImpostos+"\nValor final do veiculo R$ "+precoFinal);
     }
 }