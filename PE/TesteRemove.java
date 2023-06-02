package PE;

public class TesteRemove {
    public static void main(String[] args) {
    BlocoLista el = new BlocoLista();
    el.add ("elemento 3");
    el.add ("elemento 2");
    el.add ("elemento 1");
    /*BlocoLista el1 = el.getElemento(1);
    System.out.println(el1.elemento);
    el.removeElemento(1);
    el1 = el.getElemento(1);
    System.out.println(el1.elemento);
    }*/
    System.out.println(el.getElemento(0).elemento); /*1*/
    el.removeElemento(0);
    System.out.println(el.getElemento(0).elemento);
}
}
