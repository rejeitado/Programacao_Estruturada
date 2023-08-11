package jogo21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Baralho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carta> maoJogador = new ArrayList<>();
        List<Carta> maoDealer = new ArrayList<>();
        Random random = new Random();

        // Inicialização do baralho
        List<Carta> baralho = criarBaralho();  // Cria um baralho de cartas
        Collections.shuffle(baralho);  // Embaralha o baralho

        // Distribuição inicial das cartas
        maoJogador.add(pedirCarta(baralho));  // Jogador recebe uma carta
        maoJogador.add(pedirCarta(baralho));  // Jogador recebe outra carta
        maoDealer.add(pedirCarta(baralho));   // Dealer recebe uma carta

        // Lógica do jogo
        boolean continuar = true;
        while (continuar) {
            System.out.println("Sua mão: " + maoJogador);
            int pontuacaoJogador = calcularPontuacao(maoJogador);
            System.out.println("Pontuação atual: " + pontuacaoJogador);

            if (pontuacaoJogador == 21) {
                System.out.println("Você tem 21! Você vence!");
                continuar = false;
            } else if (pontuacaoJogador > 21) {
                System.out.println("Você estourou! Pontuação: " + pontuacaoJogador);
                continuar = false;
            } else {
                System.out.print("Deseja mais uma carta? (s/n): ");
                String escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("s")) {
                    maoJogador.add(pedirCarta(baralho));  // Jogador recebe mais uma carta
                } else {
                    continuar = false;  // Jogador decide parar de pedir cartas
                }
            }
        }

        // Dealer pega cartas até ter pelo menos 17 pontos
        while (calcularPontuacao(maoDealer) < 17) {
            maoDealer.add(pedirCarta(baralho));
        }

        // Resultado do jogo
        int pontuacaoJogador = calcularPontuacao(maoJogador);
        int pontuacaoDealer = calcularPontuacao(maoDealer);

        System.out.println("Sua mão final: " + maoJogador);
        System.out.println("Mão do dealer: " + maoDealer);

        if (pontuacaoJogador > 21) {
            System.out.println("Você estourou! Dealer vence.");
        } else if (pontuacaoDealer > 21 || pontuacaoJogador > pontuacaoDealer) {
            System.out.println("Você venceu!");
        } else if (pontuacaoJogador == pontuacaoDealer) {
            System.out.println("Empate!");
        } else {
            System.out.println("Dealer vence.");
        }
    }

    // Função para criar um baralho de cartas
    public static List<Carta> criarBaralho() {
        List<Carta> baralho = new ArrayList<>();
        String[] naipes = {"Ouros", "Espadas", "Paus", "Copas"};
        String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Rei"};

        // Cria todas as combinações de cartas
        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(new Carta(valor, naipe));
            }
        }

        return baralho;
    }

    // Função para pegar uma carta do baralho
    public static Carta pedirCarta(List<Carta> baralho) {
        if (!baralho.isEmpty()) {
            return baralho.remove(baralho.size() - 1);  // Remove e retorna a última carta do baralho
        } else {
            return null;  // Baralho vazio, retorna null
        }
    }

    // Função para calcular a pontuação de uma mão de cartas
    public static int calcularPontuacao(List<Carta> mao) {
        int pontuacao = 0;
        int asCount = 0;

        // Calcula a pontuação total considerando as cartas e os possíveis valores de Ás
        for (Carta carta : mao) {
            int valor = carta.getValorNumerico();
            pontuacao += valor;

            if (valor == 1) {
                asCount++;
            }
        }

        // Se houver Ás e a pontuação estourar, ajusta o valor do Ás
        while (pontuacao > 21 && asCount > 0) {
            pontuacao -= 10;
            asCount--;
        }

        return pontuacao;
    }
}

// Classe que define uma Carta com valor e naipe
class Carta {
    private String valor;
    private String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    // Retorna o valor numérico da carta
    public int getValorNumerico() {
        if (valor.equals("Ás")) {
            return 11;  // Ás pode valer 1 ou 11
        } else if (valor.equals("Valete") || valor.equals("Dama") || valor.equals("Rei")) {
            return 10;
        } else {
            return Integer.parseInt(valor);  // Converte o valor para inteiro
        }
    }

    // Representação da carta como String
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
