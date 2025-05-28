import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<FuncionarioTI> funcionariosti;
	
	public Sistema() {
		this.funcionariosti = new ArrayList<FuncionarioTI>();
	}
	
	public void addFuncionario(FuncionarioTI funcionario) {
		this.funcionariosti.add(funcionario);
	}
	
	public void listarFuncionarios() {
		System.out.println("Lista de funcionarios do sistema:");
		for(FuncionarioTI f : this.funcionariosti) {
			f.exibirDados();
		}
	}
	
	public FuncionarioTI getFuncionario(String matricula) {
		for(FuncionarioTI f : this.funcionariosti) {
			if(f.getMatricula().equals(matricula)) {
				return f;
			}
		}
		
		return null;
	}
}
