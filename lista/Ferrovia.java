import java.util.Stack;

public class Ferrovia {

  // Esta classe representa um trem.

  private Stack<Vagao> vagões;

  // Este campo armazena os vagões do trem.

  public Ferrovia() {
    vagões = new Stack<>();
  }

  // Este construtor cria um novo trem sem vagões.

  public void atracar(Vagao vagao) {
    vagões.push(vagao);
  }

  // Este método adiciona um vagão ao trem.

  public void mudarRota() {
    Vagao vagao = vagões.pop();
    vagões.push(vagao);
  }

  // Este método muda a rota do trem, invertendo a ordem dos vagões.

  public void imprimirVagoes() {
    for (Vagao vagao : vagões) {
      System.out.println(vagao);
    }
  }

  // Este método imprime os vagões do trem.

  public static void main(String[] args) {
    Ferrovia trem = new Ferrovia();

    trem.atracar(new Vagao("Vagao 1"));
    trem.atracar(new Vagao("Vagao 2"));
    trem.atracar(new Vagao("Vagao 3"));

    trem.imprimirVagoes(); // Vagao 1, Vagao 2, Vagao 3

    trem.mudarRota();

    trem.imprimirVagoes(); // Vagao 3, Vagao 2, Vagao 1
  }
}

class Vagao {

  // Esta classe representa um vagão.

  private String nome;

  // Este campo armazena o nome do vagão.

  public Vagao(String nome) {
    this.nome = nome;
  }

  // Este construtor cria um novo vagão com o nome especificado.

  @Override
  public String toString() {
    return nome;
  }

  // Este método retorna uma representação textual do vagão.
}