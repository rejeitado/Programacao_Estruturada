public class Fila {
    
    public ListNode listNode = new ListNode();

    public void enfileirar(String content){

        listNode.add(content,listNode.getLength());
    }
    public Node desenfileirar(){
        return this.listNode.remove(0);
    }

    public void imprimir() {
        this.listNode.imprimir();
    }
}
