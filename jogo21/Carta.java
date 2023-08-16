package jogo21;

public class Carta {

    private String valor;
    private String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    // Retorna o valor numérico da carta
    public int getValorNumerico() {
        if (valor.equals("Ás")) {
            return 11; // Ás pode valer 1 ou 11
        } else if (valor.equals("Valete") || valor.equals("Dama") || valor.equals("Rei")) {
            return 10;
        } else {
            return Integer.parseInt(valor); // Converte o valor para inteiro
        }
    }

    // Representação da carta como String
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }

}
