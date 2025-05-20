package UML;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private long  CPF;
    private long  CNH;
    private List<Carro> carrosUsados;


    public Pessoa(String nome, long CPF, long CNH) {
        this.nome = nome;
        this.CPF = CPF;
        this.CNH = CNH;
        this.carrosUsados = new ArrayList<>();
    }

    public void usarCarro(Carro carro) {
        carro.setMotorista(this);
        carrosUsados.add(carro);
        System.out.println(nome + " Está usando o: " + carro.getModelo());


    }
    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome;
    }

}
