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

        if (this.head == null) {
            // estourar erro
            System.out.println("deu erro bobao");
            return null;
        }

        T aux = head.getValue();
        this.head = this.head.getNext();

        if(this.head != null ) {
            this.head.setPrevious(null);
            // this.size--;
        }    
        
        // this.head = null;
        this.size--;
        return aux;
    }

}


