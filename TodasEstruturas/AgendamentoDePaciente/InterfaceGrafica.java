import java.util.ArrayList;
import java.util.Scanner;

class InterfaceGrafica{
	
	public static void menu(){
		byte controle;
		boolean fluxo = true;
		Scanner read = new Scanner(System.in);
		ArrayList<Pessoa> listaPacientes = new ArrayList<>();
		Pessoa pacientes = new Pessoa();
		do{
			System.out.print("1 - Para agendar um paciente\n2 - Para mostrar todos os pacientes agendados\n>> ");	
			controle = read.nextByte();
			if(controle == 1){
				System.out.print("Digite o nome do paciente >> ");
				pacientes.nome = read.next();
				System.out.print("Digite a idade do paciente >> ");
				pacientes.idade = read.nextInt();
				System.out.print("Digite o horário para atendimento DDMMAAAA >> ");
				pacientes.horarioAtendimento = read.next();
				listaPacientes.add(pacientes);
				pacientes = new Pessoa();

			}else if(controle == 2){
				for(int i = 0; i < listaPacientes.size(); i++){
					System.out.println(listaPacientes.get(i).nome);
					System.out.println(listaPacientes.get(i).idade);
					System.out.println(listaPacientes.get(i).horarioAtendimento);
					fluxo = false;
				}
			}else
				System.out.println("Opção inválida!");
		}while(fluxo);
	}

}