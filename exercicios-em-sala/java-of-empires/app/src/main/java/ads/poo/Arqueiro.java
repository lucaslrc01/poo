package ads.poo;

public class Arqueiro extends Pessoa{
    public Arqueiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover(double distancia) {
        return "Arqueiro " + super.mover(distancia);
    }

    @Override
    public String atacar() {
        return "Arqueiro " + super.atacar();
    }
}
