package ads.poo;

public enum DiasDaSemana {
    DOMINGO("domingo"),
    SEGUNDA("segunda"),
    TERCA("terça"),
    QUARTA("quarta"),
    QUINTA("quinta"),
    SEXTA("sexta"),
    SABADO("sabado");

    private String nome;

    DiasDaSemana(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
