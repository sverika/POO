import java.util.Scanner;

public class AdministradorRedes extends FuncionarioTI {
	private String certificacao;
	private String sistema;
	
	public AdministradorRedes(String nome,String matricula,String certificacao,String sistema) {
		super(nome,matricula);
		
		this.certificacao = certificacao;
		this.sistema = sistema;
	}
	
	public void monitorarRede() {
		System.out.println("Monitorando o sistema "+this.sistema);
		System.out.println("Certificação: "+this.certificacao);
	}
	
	public void realizarBackup() {
		System.out.println("Realizando backup do sistema: "+this.sistema);
	}
	
	@Override
	public void acaoFuncionario() {
		// TODO Auto-generated method stub
		System.out.println("Escolha uma acao:");
		System.out.println("1. Monitorar rede");
		System.out.println("2. Realizar backup");
		Scanner scanner = new Scanner(System.in);
		
		switch(scanner.nextInt()) {
		case 1:
			this.monitorarRede();
			return;
		case 2:
			this.realizarBackup();
			return;
		default:
			return;
		}
	}
	
	public String getCertificado() {
		return this.certificacao;
	}
}
