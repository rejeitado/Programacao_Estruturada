package lista;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
    private Node primeiro; // Referência ao primeiro elemento da fila
    private Node ultimo;   // Referência ao último elemento da fila

    // Classe Node representa um nó da fila
    private class Node {
        T elemento; // Elemento armazenado no nó
        Node proximo;    // Referência ao próximo nó

        public Node(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    // Adiciona um elemento ao final da fila
    public void enfileirar(T elemento) {
        Node novoNode = new Node(elemento);

        if (primeiro == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            ultimo.proximo = novoNode;
            ultimo = novoNode;
        }
    }

    // Remove e retorna o elemento do início da fila
    public T desenfileirar() {
        if (primeiro == null) {
            return null; // Fila vazia, retorna null
        } else {
            T elemento = primeiro.elemento;
            primeiro = primeiro.proximo;

            if (primeiro == null) {
                ultimo = null; // Fila ficou vazia, atualiza a referência para o último elemento
            }

            return elemento;
        }
    }

    // Retorna uma lista com todos os elementos da fila
    public List<T> listarElementos() {
        List<T> elementos = new ArrayList<>();
        Node atual = primeiro;

        while (atual != null) {
            elementos.add(atual.elemento);
            atual = atual.proximo;
        }

        return elementos;
    }

    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enfileirar("Elemento 1");
        fila.enfileirar("Elemento 2");
        fila.enfileirar("Elemento 3");

        List<String> elementos = fila.listarElementos();
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
