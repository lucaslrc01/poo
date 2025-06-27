package ads.poo;

public class Aldeao extends Pessoa implements Coletor, Guerreiro{

    public Aldeao(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Aldeão atacou, causando " + ataque + " de dano";
    }

    @Override
    public String mover() {
        return "Aldeão se moveu, velocidade: " + velocidade;
    }

    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }
}
