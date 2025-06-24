package ads.poo;

public class Pessoa {
    private double vida;
    private double ataque;
    private double velocidade;

    public Pessoa(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(double distancia) {
        return "se moveu " + distancia + "(unidade de distancia) a uma velocidade de " + velocidade + ".";
    }

    public String atacar() {
        return "causou " + ataque + " de dano.";
    }
}
