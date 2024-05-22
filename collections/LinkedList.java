package collections;

import collections.exceptions.*;
import collections.iterator.Iterable;
import collections.iterator.Iterator;
import collections.iterator.LinkedListIterator;

public class LinkedList<T> extends List<T> implements Iterable<T>{
    
    private Node<T> head = null;
    private Node<T> tail = null;
    
    @Override
    public void add(T value) {
    
        // instancia o nó
        Node<T> newnode = new Node<T>(value);
        this.size++;
    
        if (head == null) {
            head = newnode;
            tail = head;
            return;
        }
    
        newnode.setPrevious(tail);
        tail.setNext(newnode);
        tail = newnode;
    }
    @Override
    public T get(int index) throws CheckedException {

        if (index < size) {
            // instancia um nó para percorer a lista
            Node<T> current = head;
    
            while (index > 0) {
                current = current.getNext();
                index--;
            }
    
            return current.getValue();
        }
        throw new CheckedException("Indice inválido po.");
    }
    @Override
    
    public void set(int index, T value) throws CheckedException {
        
        if (index >= size) {
            throw new CheckedException("Indice inválido po.");
        }

        // instancia um nó para percorer a lista
        Node<T> current = head;
        
        int i = 0;

        while (i != index) {
            current = current.getNext();
            i++;
        }

        current.setValue(value);
    }

    public Node<T> getHead() {
        return this.head;
    }
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }
}    
