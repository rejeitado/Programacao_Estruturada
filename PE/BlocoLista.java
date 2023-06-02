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

    public BlocoLista getElemento(int i) {
        BlocoLista aux = this.prox;
        int c = 0;
        while (aux != null) {
            if (c == i) {
                return aux;
            }
            aux = aux.prox;
            c++;
        }
        return null;
    }
    
public BlocoLista removeElemento(int i){
    BlocoLista aux = getElemento(i-1);
    BlocoLista rem = aux.prox;
    aux.prox = aux.prox.prox;
    return rem;

}

    public static void main(String[] args) {
        BlocoLista bl = new BlocoLista();
        bl.add("elemento 1");
        bl.add("elemento 2");
        bl.add("elemento 3");
        System.out.println(bl.getElemento(1));
    }

}
