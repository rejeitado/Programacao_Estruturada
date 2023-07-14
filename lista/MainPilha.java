public class MainPilha {

    public static void main(String[] args) {
       
        Pilha p = new Pilha();

        p.emPilhar("node 1");
        p.emPilhar("node 2");
        p.emPilhar("node 3");

        p.imprimir();

        p.desemPilhar();

        p.imprimir();

        p.desemPilhar();

        p.imprimir();
         

      //  p.imprimir();
    }
    
}
