package collections;

import collections.iterator.*;
import collections.exceptions.*;

public class LinkedList<T> extends List<T> implements IterableBanana<T>{

    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public T get(int index) throws CheckedException{

        if (index <= size) {
            // instancia um nó para percorer a lista
            Node<T> current = head;
            
            int i = 0;
    
            while (i != index) {
                current = current.getNext();
                i++;
            }
    
            return current.getValue();
        }

        throw new CheckedException("Index não existente na lista.");

    }
    
    @Override
    public void set(int index, T value) throws CheckedException {
        
        if (index <= size) {
            // instancia um nó para percorer a lista
            Node<T> current = head;
            
            int i = 0;
    
            while (i != index) {
                current = current.getNext();
                i++;
            }
    
            current.setValue(value);
            return;
        }

        throw new CheckedException("Index não existente na lista.");
       
    }

    @Override
    public void add(T value) {

        // instancia o nó
        Node<T> newnode = new Node<T>(value);
        size ++;

        if (head == null) {
            head = newnode;
            tail = head;
            return;
        }

        newnode.setPrevious(tail);
        tail.setNext(newnode);
        tail = newnode;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    @Override
    public Iterator<T> iterator() {

        LinkedListIterator<T> linkedlistiterator = new LinkedListIterator<>();
        return linkedlistiterator;
    }

    @Override
    public Stream<T> stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }

}    
