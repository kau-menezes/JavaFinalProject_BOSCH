package collections;

public class Queue<T> extends Origin {

    private Node <T>head = null;
    private Node <T>tail = null;

    public void enqueue(T value)
    {
        Node<T> node = new Node<>(value);
        if(head == null) {
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
        this.size++;
    }

    //remove o primeiro
    public T dequeue() 
    {
        if(this.head.getNext() != null) {
            T aux = head.getValue();
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            this.size--;
            return aux;
        }    

        this.head = null;
        this.size--;
        return null;
    }

}


