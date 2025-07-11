package ads.poo;

public enum SistemaSolar {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private int posicao;

    SistemaSolar(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(posicao);
        return sb.toString();
    }
}
