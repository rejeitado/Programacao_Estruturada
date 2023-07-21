import java.util.Stack;

public class FilaComPilhas {

private Stack<Integer> pilha1;
private Stack<Integer> pilha2;

// Construtor da classe FilaComPilhas.
public FilaComPilhas() {
// Inicializa as pilhas pilha1 e pilha2 como vazias.
pilha1 = new Stack<>();
pilha2 = new Stack<>();
}

// Método empilhar que adiciona um elemento na fila.
public void empilhar(int elemento) {
// Adiciona o elemento na pilha pilha1.
pilha1.push(elemento);
}

// Método desempilhar que remove um elemento da fila.
public int desempilhar() {
// Se a pilha pilha2 estiver vazia, move todos os elementos da pilha pilha1 para a pilha pilha2.
if (pilha2.isEmpty()) {
while (!pilha1.isEmpty()) {
pilha2.push(pilha1.pop());
}
}

// Remove o elemento do topo da pilha `pilha2`.
return pilha2.pop();
}

// Método main que enfileira os números 1, 2 e 3 na fila e, em seguida, desenfileira os números da fila.
public static void main(String[] args) {
// Cria uma nova instância da classe FilaComPilhas.
FilaComPilhas fila = new FilaComPilhas();

// Enfileira os números 1, 2 e 3 na fila.
fila.empilhar(1);
fila.empilhar(2);
fila.empilhar(3);

// Desenfileira os números da fila e imprime-os.
System.out.println(fila.desempilhar()); // 1
System.out.println(fila.desempilhar()); // 2
System.out.println(fila.desempilhar()); // 3
}
}