package UML;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa motorista =  new Pessoa("José", 568-958-756-679, 967934826);

        Carro carroPilotado = new Carro( "Celta", "Chevrolet", "Preto", 100 );
        Carro hb20 = new Carro("HB20", "Chevrolet", "Branco", 200 );

        motorista.usarCarro(carroPilotado);
        motorista.usarCarro(hb20);


        System.out.println("####Informações do carro pilotado####");
        System.out.println("descrição: " + carroPilotado.getDescricao());
        System.out.println("Modelo: " + carroPilotado.getModelo());
        System.out.println("Motorista: " + carroPilotado.getMotorista().getNome());
        System.out.println("cor: " + carroPilotado.getCor());
        System.out.println("velocidade: " + carroPilotado.getVelocidade() + " km/h ");
        System.out.println("Esta ligado? " + carroPilotado.isLigado());

        System.out.println("Lista de carros usados por motorista: " + motorista.getNome());


        System.out.println("Situação de condução: ");
         carroPilotado.dirigirCarro();
    }
}