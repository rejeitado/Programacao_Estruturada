public class ListNode {

    public Node refNode;
    public int length = 0;


    public void add(String content) {

        Node newNode =  new Node();
        newNode.content = content;

        newNode.prox = this.refNode;
        this.refNode = newNode;
        this.length++;

    }

    public Node remove() {

        if(this.refNode == null) {
            return null;
        } 
        this.length--;
        Node rem = this.refNode;
        this.refNode = this.refNode.prox;

        return rem;
    }

    /*
     * Imprime a lista de conteúdos
     */
    public void imprimir() {
        System.out.println("Lista de Conteúdos:");
        for(int i=0;i<this.length;i++) {
            System.out.println(this.getNode(i).content);
        }
    }

/*
 * Retorna uma lista invertida da lista original
 */
   public ListNode invert() {
    ListNode invertedList = new ListNode(); // Lista invertida
    Node current = this.refNode; // Referência ao nó atual da lista original

    while (current != null) {
        invertedList.add(current.content); 
        current = current.prox; 
    }

    return invertedList;
}

/*
 * Adiciona o conteúdo na posição i, caso não exista adiciona no início.
 */
    public void addFirst(String content, int i) {
        if (i <=0) {
            add(content);
        }else {
            Node newNode = getNode(i - 1);
            if(newNode == null){
                add(content);
                return;
            }
            Node addNode = new Node();
            addNode.content = content;
            addNode.prox = newNode.prox;
            newNode.prox = addNode;
            this.length++;
        }

    }
/*
 * Subtitui o conteúdo do node i, caso não exista não faz nada
 */
    public void replace(String content, int i) {
    Node node = getNode(i);

        if (node != null) {
            node.content = content; 
        }
        else{
            return;
        }

    }

    public ListNode newList(int length, String content) {
    ListNode newList = new ListNode();  
    for (int i = 0; i < length; i++) {
        newList.add(content); 
    }
    return newList;
}


/*
 * Retorna o node da posição i
 */
    public Node getNode(int i) {
        Node aux = this.refNode;
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

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("Lista original:");
        list.imprimir();

        ListNode invertedList = list.invert();
        System.out.println("Lista invertida:");
        invertedList.imprimir();

        list.addFirst("4", 2);
        System.out.println("Lista com adição na posição 2:");
        list.imprimir();

        list.replace("5", 1);
        System.out.println("Lista com substituição na posição 1:");
        list.imprimir();

        ListNode newList = list.newList(3, "6");
        System.out.println("Nova lista criada:");
        newList.imprimir();
    }
}
