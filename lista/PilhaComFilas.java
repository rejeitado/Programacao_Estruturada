import java.util.LinkedList;
import java.util.Queue;

public class PilhaComFilas {

    private Queue<String> queue1;
    private Queue<String> queue2;

    public PilhaComFilas() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void emPilhar(String content) {
        // Adicionar o elemento na fila 1
        queue1.add(content);
    }

    public void imprimir() {
        // Imprimir os elementos da fila 1
        System.out.println("Pilha:");
        for (String content : queue1) {
            System.out.println(content);
        }
    }

    public String desemPilhar() {
        // Transferir os elementos da fila 1 para a fila 2, exceto o último elemento
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // Remover e retornar o último elemento da fila 1 (o elemento do topo da pilha)
        String removedItem = queue1.remove();

        // Trocar as referências das filas para manter a estrutura correta da pilha
        Queue<String> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return removedItem;
    }

    public static void main(String[] args) {
        PilhaComFilas pilha = new PilhaComFilas();

        pilha.emPilhar("Elemento 1");
        pilha.emPilhar("Elemento 2");
        pilha.emPilhar("Elemento 3");

        pilha.imprimir();

        String desempilhado = pilha.desemPilhar();
        System.out.println("Desempilhado: " + desempilhado);

        pilha.emPilhar("Elemento 4");

        pilha.imprimir();
    }
}