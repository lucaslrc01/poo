package ads.poo;

public class Arqueiro extends Pessoa implements Guerreiro{
    public Arqueiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return "Arqueiro se moveu, velocidade: " + velocidade;
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou, causando " + ataque + " de dano";
    }
}
