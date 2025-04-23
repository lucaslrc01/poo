package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private String desenho;

    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }

    public void abrirFechar() {
        this.aberta = !aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void definirNivelTinta(double n) {
        if (n > 0 && n <= 100) {
            nivelTinta = n;
        } else if (n <= 0) {
            nivelTinta = 0;
        } else {
            nivelTinta = 100;
        }
    }

    public double obterNivelTinta() {
        return nivelTinta;
    }

    public void definirDesenho(int d) {
        d = (int)nivelTinta / 10;
        if (aberta) {
            desenho = "-".repeat(d);
        } else {
            desenho = "Abra a caneta";
        }
    }

    public String obterDesenho() {
        return desenho;
    }
}