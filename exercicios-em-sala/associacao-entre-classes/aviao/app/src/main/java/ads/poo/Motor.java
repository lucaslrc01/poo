package ads.poo;

public class Motor {
    private String tipo;
    private double consumoHora;
    private boolean ligado;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.consumoHora = consumoHora;
        this.ligado = false;
    }

    public boolean ligarDesligar() {
        this.ligado = !this.ligado;
        return ligado;
    }
}
