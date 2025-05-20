package UML;

public class Carro {
    private String descricao;
    private String modelo;
    private String cor;
    private float velocidade;
    private Pessoa motorista = null;
    private boolean ligado = true;

    public Carro(String descricao, String modelo, String cor, float velocidade){
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;

    }
    public String getDescricao(){

        return descricao;
    }

    public String setDescricao(String descricao){
        this.descricao = descricao;
        return descricao;
    }

    public String getModelo(){

        return modelo;
    }

    public String setModelo(String modelo){
        this.modelo = modelo;
        return modelo;
    }

    public String getCor(){
        return cor;
    }
    public String setCor(String cor){
        this.cor = cor;
        return cor;
    }

    public float getVelocidade() {

        return velocidade;
    }
    public void setVelocidade(float velocidade) {

         this.velocidade  = velocidade;
    }
    public Pessoa getMotorista() {

        return motorista;
    }
    public void setMotorista( Pessoa motorista) {

        this.motorista = motorista;
    }

    public boolean  isLigado() {
        return ligado;
    }
    public void ligarCarro(){
       this.ligado = true;
        System.out.println("O carro está ligado!");
        }

        public void desligarCarro(){
        this.ligado = false;
            System.out.println("O carro desligado!");
        }

    public void dirigirCarro(){
        if(motorista !=null && ligado){
            System.out.println("O carro está em movimento a" + velocidade + "km/h" );
        }else{
            System.out.println("O carro brecou, verifique se há um motorista ou se está ligado!");
        }
    }

    }








