package PEN;

public class BlocoLista2 {
    Bloco inicio;

    public void add(float valor) {
        Bloco bl = new Bloco(valor);
        bl.prox = this.inicio;
        this.inicio = bl;
    }

    public Bloco getBloco(int i){
        Bloco aux = this.inicio;
        int c = 0;
        while (aux != null){
            if (c == i) {
                return aux;
            }
            aux = aux.prox;
            c++;
        }
        return null;
    }

    public void remover(int i) {
        Bloco b = this.getBloco(i);
        if(b == null){
            return;
        }
        
        if(i == 0){
            this.inicio = this.inicio.prox;
        }

        else{
            b = this.getBloco(i-1);
            b.prox = b.prox.prox;
        }
    }

    public static void main(String[] args) {
        BlocoLista2 bl = new BlocoLista2();
        bl.add(40);
        bl.add(50);
        bl.add(70);
        bl.remover(0);

        Bloco aux = bl.inicio;

        float soma = 0;

        while (aux != null) {
            System.out.println(aux.valor);
            soma += aux.valor;
            aux = aux.prox;

        }
        System.out.println(soma);
    }
}
