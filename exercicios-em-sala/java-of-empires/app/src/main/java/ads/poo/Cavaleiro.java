package ads.poo;

public class Cavaleiro extends Pessoa{
    public Cavaleiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover(double distancia) {
        return "Cavaleiro " + super.mover(distancia);
    }

    @Override
    public String atacar() {
        return "Cavaleiro " + super.atacar();
    }
}
