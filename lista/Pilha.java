package lista;

public class Pilha {

    public ListNode listNode = new ListNode();

    public void emPilhar(String content){
        this.listNode.add(content, 0);

    }

    public Node desemPilhar(){
        return listNode.remove(0);

    }

}
