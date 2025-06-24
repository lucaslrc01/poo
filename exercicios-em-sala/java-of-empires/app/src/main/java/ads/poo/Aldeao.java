package ads.poo;

public class Aldeao extends Pessoa{

    public Aldeao(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover(double distancia) {
        return "Aldeão " + super.mover(distancia);
    }

    @Override
    public String atacar() {
        return "Aldeão " + super.atacar();
    }
}
