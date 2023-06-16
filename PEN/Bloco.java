package PEN;

public class Bloco {
    public Bloco prox;
    public float valor;

    public Bloco(float valor) {
        this.valor = valor;
    }

    public Bloco() {
    }

    public static void main(String[] args) {
        Bloco b1 = new Bloco(10);
        Bloco b2 = new Bloco(40);
        Bloco b3 = new Bloco(70);

        b1.prox = b2;
        b2.prox = b3;

        Bloco aux = b1;

        float soma = 0;

        while (aux != null) {
            System.out.println(aux.valor);
            soma += aux.valor;
            aux = aux.prox;

        }
        System.out.println(soma);


    }
}