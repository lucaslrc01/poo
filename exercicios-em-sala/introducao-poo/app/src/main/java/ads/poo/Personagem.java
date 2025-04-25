package ads.poo;

public class Personagem {
    // informações básicas
    private String classe;

    // atributos
    private int forca;
    private int agilidade;
    private int constituicao;
    private int inteligencia;

    // estatisticas
    private int vida;
    private int estamina;
    private int mana;

    // classe
    public void definirClasse(String c) {
        classe = c;
    }

    // atributos
    public void definirForca(int f) {
        forca = f;
    }

    public void definirAgilidade(int a) {
        agilidade = a;
    }

    public void definirDefesa(int d) {
        constituicao = d;
    }

    public void definirinteligencia(int i) {
        inteligencia = i;
    }

    // estatisticas
    public void definirVida() {
        vida = constituicao * 10;
    }

    public void definirEstamina() {
        estamina = (constituicao * 10) - (agilidade * 3);
    }

    public void definirMana() {
        mana = inteligencia * 10;
    }

    // ficha
    public String obterFicha() {
        
    }
}
