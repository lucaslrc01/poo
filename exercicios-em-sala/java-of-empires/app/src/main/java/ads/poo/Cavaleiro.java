package ads.poo;

public class Cavaleiro extends Pessoa implements Guerreiro{
    public Cavaleiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return "Cavaleiro se moveu, velocidade: " + velocidade;
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou, causando " + ataque + " de dano";
    }
}
