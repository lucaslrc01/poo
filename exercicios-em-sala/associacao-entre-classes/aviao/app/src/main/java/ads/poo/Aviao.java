package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int capacidade;
    private double pesoMax;
    private double combustivel;

    private String tipo;
    private int qtdMotores;
    private ArrayList<Motor> motores;

    private boolean ligado;

    public Aviao(int capacidade, double pesoMax, double combustivel, int qtdMotores, String tipo, boolean ligado) {
        this.capacidade = capacidade;
        this.pesoMax = pesoMax;
        this.combustivel = combustivel;
        this.qtdMotores = qtdMotores;
        this.tipo = tipo;
        this.ligado = false;
    }

   public void adicionaMotores(int qtdMotores) {
       for (int i = 0; i < qtdMotores; i++) {
           this.motores.add(new Motor(tipo));
       }
   }

   public void ligarDesligar(int qtdMotores) {
       this.ligado = !this.ligado;

       if (ligado == false) {
           for (int i = 0; i < qtdMotores; i++) {
                this.motores.remove(i);
           }
       }
   }
}
