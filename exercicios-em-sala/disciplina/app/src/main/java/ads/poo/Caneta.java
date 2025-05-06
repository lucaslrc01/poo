package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    private static final double NIVEL_PADRAO = 100;
    private static final String CARACTER_PADRAO = "-";

    public Caneta(String cor, double nivelTinta, boolean aberta) {
        this.aberta = aberta;
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(String cor) {
        this(cor, NIVEL_PADRAO, false);
    }
    public Caneta(int nivelTinta) {
        this("preta", nivelTinta, false);
    }

    public Caneta(boolean aberta) {
        this("preta", 100, aberta);
    }

    public Caneta() {
        this("preta", 100 , false);
    }

    // ----------------------------------------------------------- //



    public String desenhar(int quantidade, String caracter) {
        return caracter.repeat(quantidade);
    }

    public String desenhar(int quantidade) {
        return this.desenhar(quantidade, CARACTER_PADRAO);
    }



    // --------------------------------------------------------------------- //



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}
