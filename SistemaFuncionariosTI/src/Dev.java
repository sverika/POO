import java.util.Scanner;

public class Dev extends FuncionarioTI {
	private String linguagemPrincipal;
	private String nivel;
	private String projeto;
	
	public Dev(String nome,String matricula, String linguagem, String nivel) {
		super(nome,matricula);
		this.linguagemPrincipal = linguagem;
		this.nivel = nivel;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println(this.nivel);
		this.imprimirSeparador();
	}
	
	public void exibirTecnologiasUsadas() {
		System.out.println("Linguagem princial:");
		System.out.println(this.linguagemPrincipal);
		switch (this.linguagemPrincipal) {
		case "Java":
			System.out.println("Programador back-end");
			break;
		case "Python":
			System.out.println("Programador ciencia de dados");
			break;
		case "JavaScript":
			System.out.println("Programador front-end");
			break;
		case "Rust":
			System.out.println("Programador inteligente");
		}
	}
	
	public void desenvolverProjeto(String nome,String descricao) {
		this.projeto = String.format(
				"--------------------------------------------------------------------\n"
				+"%s\n"
				+"--------------------------------------------------------------------\n"
				+"Tecnologia usada: %s\n"
				+"Decrição do projeto:\n %s",
				nome,
				this.linguagemPrincipal,
				descricao
			);
		
		System.out.println("Projeto "+nome+" desenvolvido com sucesso.");
	}
	
	public void atualizarProjeto(String descricao) {
		this.projeto += descricao+"\n";
	}
	
	public void revisarCodigo() {
		System.out.println(this.projeto);
		System.out.println("Atualize o projeto:");
		
		Scanner scanner = new Scanner(System.in);
		this.atualizarProjeto(scanner.nextLine());
	}
	
	@Override
	public void acaoFuncionario() {
		// TODO Auto-generated method stub
		System.out.println("Escolha uma acao:");
		System.out.println("1. Criar projeto");
		System.out.println("2. Atualizar projeto");
		System.out.println("3. Revisar código");
		Scanner scanner = new Scanner(System.in);
		String linha = "";
		
		switch(scanner.nextInt()) {
		case 1:
			if(this.projeto != "") {
				System.out.println("Desenvolver um novo projeto? Se fizer isso, seu projeto atual será apagado! (y/n)");
				if(scanner.next() == "y") {
					break;
				} else {
					return;
				}
			}
			System.out.println("Nome do projeto:");
			String nome = scanner.next();
			String descricao = "";
			
			
			System.out.println("Descrição do projeto: (Apenas aperte enter em uma linha vazia para concluir)");
			do {
				linha = scanner.next();
				descricao += linha;
			} while(linha != "");
			
			this.desenvolverProjeto(nome, descricao);
			return;
		case 2:
			System.out.println("Informe adições ao projeto:");
			String texto = "";
			do {
				linha = scanner.next();
				texto += linha;
			} while(linha != "");
			return;
		case 3:
			this.revisarCodigo();
			return;
		default:
			return;
		}
	}
}
