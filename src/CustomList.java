public class CustomList <E>{
    private class Node{
        E value;
        Node next;
        public Node(E value){
            this.value=value;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public CustomList() {
        head = null;
        tail = null;
    }
    void addLast(E value){
        Node newNode = new Node(value);
        if(tail==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public E getLast(){
        if(tail==null){
            throw new IllegalStateException("Lista jest pusta");
        }
        return tail.value;
    }

    public void addFirst(E value){
        Node newNode = new Node(value);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public E getFirst(){
        if(head==null){
            throw new IllegalStateException("Lista jest pusta");
        }
        return head.value;
    }

    public E removeFirst(){
        if(head==null){
            throw new IllegalStateException("Lista jest pusta");
        }
        E value = head.value;
        head=head.next;
    }
}
