package PE;

public class BlocoLista {

    public BlocoLista prox;
    public String elemento;

    public void add(String elemento) {
        BlocoLista bl = new BlocoLista();
        bl.elemento = elemento;
        bl.prox = this.prox;
        this.prox = bl;
    }

    public String getElemento(int i) {
        BlocoLista aux = this.prox;
        int c = 0;
        while (aux != null) {
            if (c == i) {
                return aux.elemento;
            }
            aux = aux.prox;
            c++;
        }
        return null;
    }

    public static void main(String[] args) {
        BlocoLista bl = new BlocoLista();
        bl.add("elemento 1");
        bl.add("elemento 2");
        System.out.println(bl.getElemento(1));
    }

}
