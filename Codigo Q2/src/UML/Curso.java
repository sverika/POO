package UML;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private int nivel;
    private String descricao;
    private List<Instrutor> instrutores;  // associação com Instrutor

    public Curso(String nome, int cargaHoraria, int nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public int getNivel() {
        return this.nivel;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Associação com instrutores
    public void adicionarInstrutor(Instrutor instrutor) {
        if (!instrutores.contains(instrutor)) {
            instrutores.add(instrutor);
        }
    }

    public List<Instrutor> getInstrutores() {
        return this.instrutores;
    }

    // Exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores:");
        for (Instrutor i : instrutores) {
            System.out.println(" - " + i.getNome() + " (" + i.getFormacao() + ")");
        }
    }

    // Exemplo de método de cadastro (opcional)
    public void cadastrarCurso(Curso curso) {
        // Este método não faz sentido aqui, mas deixado como placeholder
        System.out.println("Curso cadastrado: " + curso.getNome());
    }
}
