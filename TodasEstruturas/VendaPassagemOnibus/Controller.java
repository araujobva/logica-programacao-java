import java.util.Scanner;

class Controller{

    static Scanner read = new Scanner(System.in);

    public static void vendaPassagem(Cliente onibus){ 
        String nome;
        String cpf;
        byte numeroPoltrona;
        System.out.print("Digite o nome do cliente >> ");
        nome = read.next();
        System.out.print("Digite o CPF do cliente >> ");
        cpf = read.next();
        System.out.print("Digite o número da poltrona desejada >> ");
        numeroPoltrona = read.nextByte();
        try {
            if(verificaPoltrona(onibus, numeroPoltrona)){ //Se uma passagem for vendida e o lugar estiver ocupado, emitir uma mensagem de erro.
                System.out.println("========== ERRO! Essa poltrona está ocupada!");
            }else{
                onibus.setNome(nome, numeroPoltrona);
                onibus.setCpf(cpf, numeroPoltrona);
                onibus.setPoltronas(numeroPoltrona, true); 
                System.out.println("========== Poltrona vendida com sucesso!");
            }   
        } catch (Exception e) {
            System.out.println("========== Esta poltrona não existe!");
        }
    }

    public static boolean verificaPoltrona(Cliente onibus, byte numeroPoltrona){
        if(onibus.getPoltronas(numeroPoltrona)){
            return true;
        }else{
            return false;
        }
    }

    public static void cancelaPassagemVendida(Cliente onibus){
        byte numeroPoltrona;
        System.out.print("Digite o número para poltrona para cancelar a venda da passagem >> ");
        numeroPoltrona = read.nextByte();
        if(verificaPoltrona(onibus, numeroPoltrona)){
            onibus.setNome(null, numeroPoltrona);
            onibus.setCpf(null, numeroPoltrona);
            onibus.setPoltronas(numeroPoltrona, false);
        }else{
            System.out.println("========== ERRO! Esta poltrona ainda não foi vendida para o sistema cancelar.");
        }
    }

    public static void listarLugaresLivres(Cliente onibus){
        for(int i = 0; i < 40; i++){
            if(onibus.getPoltronas(i) == false){
                System.out.println(i);
            }
        }
    }

    public static void listaTodosLugares(Cliente onibus){
        for(int i = 0; i < 40; i++){
            System.out.print("Lugar número "+i);
            if(onibus.getPoltronas(i)){
                System.out.println(" ocupado.");
            }else{
                System.out.println(" livre.");
            }
        }
    }

    public static void listaLugaresOcupados(Cliente onibus){
        for(int i = 0; i < 40; i++){
            if(onibus.getPoltronas(i)){
                System.out.println(i);
            }
        }
    }

    public static void desenhaOnibus(Cliente onibus){
        byte j = 0;
        for(int i = 0; i < 40; i++){
            System.out.print(i+" "+onibus.getPoltronas(i)+" - ");
            j++;
            if(j == 2){
                System.out.print("\n");
                j = 0;
            }
        }
    }

}