public class MainFila {
    
    public static void main(String[] args) {
        Fila f = new Fila();

        f.enfileirar("node 1");
        f.enfileirar("node 2");
        f.enfileirar("node 3");

        f.imprimir();

        f.desenfileirar();

        f.imprimir();

        f.desenfileirar();

        f.imprimir();
    }
}
