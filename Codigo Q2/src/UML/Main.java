package UML;

public class Main {
    public static void main(String[] args) {
        // Criar instrutores
        Instrutor instrutor1 = new Instrutor("Maria Silva", "Engenharia da Computação", "maria@exemplo.com", 5);
        Instrutor instrutor2 = new Instrutor("João Pereira", "Matemática", "joao@exemplo.com", 8);

        // Criar cursos
        Curso curso1 = new Curso("Java Básico", 40, 1, "Curso introdutório de programação Java.");
        Curso curso2 = new Curso("Algoritmos Avançados", 60, 3, "Curso focado em estrutura de dados e algoritmos.");

        // Associar instrutores aos cursos
        curso1.adicionarInstrutor(instrutor1);
        curso1.adicionarInstrutor(instrutor2);
        curso2.adicionarInstrutor(instrutor2);

        // Exibir detalhes dos cursos
        System.out.println("===== Detalhes do Curso 1 =====");
        curso1.exibirDetalhes();

        System.out.println("\n===== Detalhes do Curso 2 =====");
        curso2.exibirDetalhes();
    }
}
