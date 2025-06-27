package ads.poo;

public abstract class Pessoa {
    protected double vida;
    protected double ataque;
    protected double velocidade;

    public Pessoa(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String mover();
}
