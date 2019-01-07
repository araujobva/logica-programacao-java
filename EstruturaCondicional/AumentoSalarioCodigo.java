/*
 * Problema: Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual, mostre o cargo, o valor do aumento e seu novo salário. 
 * Os cargos estão abaixo.
 * - Código 1, cargo Escrituário, percentual 50%.
 * - Código 2, cargo Secretário, percentual 35%.
 * - Código 3, cargo Caixa, percentual 20%.
 * - Código 4, cargo Gerente, percentual 10%.
 * - Código 5, cargo Diretor, não tem aumento.
 */

 import java.util.Scanner;

 class AumentoSalarioCodigo{
     public static void main(String args[]){
         int cod;
         double salario, cod1 = 0.5, cod2 = 0.35, cod3 = 0.2, cod4 = 0.1, aumento, novoSalario;
         Scanner read = new Scanner(System.in);
         System.out.print("Digite o codigo do funcionario >> ");
         cod = read.nextInt(); 
         System.out.print("Digite o valor do salario R$ ");
         salario = read.nextDouble();
        if(cod == 1 || cod == 2 || cod == 3 || cod == 4 || cod ==5 ){
            switch(cod){
                case 1:
                    System.out.println("O cargo do funcionario e Escrituario");
                    aumento = salario * cod1;
                    novoSalario = salario + aumento;
                    System.out.println("O valor de aumento e de R$ "+aumento);
                    System.out.print("O salario reajustado e de R$ "+novoSalario);
                    break;
                case 2:
                    System.out.println("O cargo do funcionario e Secretario");
                    aumento = salario * cod2;
                    novoSalario = salario + aumento;
                    System.out.println("O valor de aumento e de R$ "+aumento);
                    System.out.println("O salario reajustado e de R$ "+novoSalario);
                    break;
                case 3:
                    System.out.println("O cargo do funcionario e Caixa");
                    aumento = salario * cod1;
                    novoSalario = salario + aumento;
                    System.out.println("O valor de aumento e de R$ "+aumento);
                    System.out.println("O salario reajustado e de R$ "+novoSalario);
                    break;
                case 4:
                    System.out.println("O cargo do funcionario e Gerente");
                    aumento = salario * cod1;
                    novoSalario = salario + aumento;
                    System.out.println("O valor de aumento e de R$ "+aumento);
                    System.out.println("O salario reajustado e de R$ "+novoSalario);
                    break;
                case 5:
                    System.out.println("O cargo do funcionario e Diretor");
                    aumento = 0;
                    novoSalario = salario + aumento;
                    System.out.println("O valor de aumento e de R$ "+aumento);
                    System.out.println("O salario reajustado e de R$ "+novoSalario);
                    break;               
            }
         }else
                System.out.println("O codigo digitado nao existe...");
     }
 }