package ads.poo;

public class Forma {
    private String corLinha;

    public int x;
    public int y;

    public int x2;
    public int y2;

    public Forma(String corLinha, int x, int y, int x2, int y2) {
        this.corLinha = corLinha;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String desenhar() {
        return "Cor da linha:" + corLinha;
    }
}
