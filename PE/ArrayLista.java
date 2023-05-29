package PE;

public class ArrayLista {
    public String lista [] = new String [10];
    private int i = -1;

    private void add (String elemento, int i){
        this.lista [i] = elemento;
    }

    private void add (String elemento){
        //System.out.println(this.i);
        if(this.i <= 8)
        this.add(elemento, ++this.i);
    }
    public String getElemento(int i){
        return this.lista[i];
    }

    public static void main (String [] args) {
        ArrayLista l1 = new ArrayLista();

        for(int i=1; i<=11; i++){
            l1.add("elemento" + i);
        }
        for (int i = 0; i<10; i++){
            System.out.println(l1.getElemento(i));
        }
        
       
    }
}
