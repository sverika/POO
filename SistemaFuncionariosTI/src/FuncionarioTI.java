
public abstract class FuncionarioTI {
	private String nome;
	private String matricula;
	
	public FuncionarioTI(String nome,String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	protected void imprimirSeparador() {
		System.out.println("----------------------------------------------");
	}
	
	public void exibirDados() {
		this.imprimirSeparador();
		System.out.println(this.nome);
		System.out.println(this.matricula);
	}
	
	public abstract void acaoFuncionario();
	
	public void atualizarCadastro(String nome,String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
}
