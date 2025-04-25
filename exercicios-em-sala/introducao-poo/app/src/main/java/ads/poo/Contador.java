package ads.poo;

public class Contador {
    private int valorAtual = 0;

    public void definirValor(int v) {
        valorAtual = v;
    }

    public void incrementarValor() {
        valorAtual++;
    }

    public int obterValor() {
        return valorAtual;
    }
}
