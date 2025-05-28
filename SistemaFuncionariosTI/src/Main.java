import java.util.Scanner;

public class Main {

	private static void imprimirAcoes() {
		System.out.println("Ações:");
		System.out.println("1. Criar funcionario");
		System.out.println("2. Ações de funcionario");
		System.out.println("3. Sair");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema();
		while(true) {
			imprimirAcoes();
			
			switch(scanner.nextInt()) {
			case 1:
				System.out.println("Nome:");
				String nome = scanner.next();
				System.out.println("Matricula:");
				String matricula = scanner.next();
				System.out.println("Qual tipo de funcionario vai ser? Digite 1 para dev, e qualquer outro numero para administrador de rede");
				if(scanner.nextInt() == 1) {
					System.out.println("Qual a linguagem de programação principal dele?");
					String linguagem = scanner.next();
					System.out.println("Qual o nivel dele? Diga 1 para Junior, 2 para Pleno e 3 para Senior. Qualquer outro valor sera considerado Junior");
					int valor = scanner.nextInt();
					
					switch (valor) {
					case 2:
						sistema.addFuncionario(new Dev(nome,matricula,linguagem,"Pleno"));
						break;
					case 3:
						sistema.addFuncionario(new Dev(nome,matricula,linguagem,"Senior"));
					default:
						sistema.addFuncionario(new Dev(nome,matricula,linguagem,"Junior"));
					}
				} else {
					System.out.println("Diga o certificado dele:");
					String certificado = scanner.next();
					System.out.println("Agora informe o sistema pelo qual ele ficara responsavel:");
					sistema.addFuncionario(new AdministradorRedes(nome, matricula, certificado, scanner.next()));
				}
				
				System.out.println("Funcionario cadastrado com sucesso");
				break;
			case 2:
				sistema.listarFuncionarios();
				System.out.println("Informe a matricula do funcionario que você quer:");
				FuncionarioTI funcionario = sistema.getFuncionario(scanner.next());
				if(funcionario == null) {
					System.out.println("Funcionario nao encontrado");
					break;
				}
				funcionario.acaoFuncionario();
				break;
			case 3:
				return;
			default:
				System.out.println("Digite uma ação válida");
			}
		}
	}

}
