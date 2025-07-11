package ads.poo;

import java.util.Arrays;

public class Disciplinas {
    private String sigla;
    private DiasDaSemana[] diasDaSemana;

    public Disciplinas(String sigla, DiasDaSemana[] diasDaSemana) {
        this.sigla = sigla;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplinas{");
        sb.append("sigla='").append(sigla).append('\'');
        sb.append(", dias=").append(Arrays.toString(diasDaSemana));
        sb.append('}');
        return sb.toString();
    }
}
