package collections;

import collections.iterator.*;

public class Queue<T> extends Origin implements IterableBanana<T> {

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

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public Iterator<T> iterator() {
        QueueIterator<T> queueiterator = new QueueIterator<>(this);
        return queueiterator;
    }

    @Override
    public Stream<T> stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }



}


