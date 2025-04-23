package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private String desenho;
    private double tintaRestante;

    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }

    public void abrirFechar() {
        aberta = !aberta;
    }

    public String isAberta() {
        if (aberta) {
            return "Aberta";
        } else {
            return "Fechada";
        }
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
            tintaRestante = nivelTinta % 10;
        } else {
            desenho = "Abra a caneta";
            tintaRestante = nivelTinta;
        }
    }

    public double obterTintaRestante() {
        return tintaRestante;
    }

    public String obterDesenho() {
        return desenho;
    }
}