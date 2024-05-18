package collections.iterator;

import collections.*;
import collections.exceptions.*;

public class QueueIterator<E> implements Iterator<E>{

    Queue<E> queue;
    Node<E> current;
    int step = -1;

    public QueueIterator(Queue<E> queue) {
        this.queue = queue;
    }

    @Override
    public E next() throws CheckedException {
        
        step++;

        if (step == 0) {
            current = queue.getHead();
            return current.getValue();
        }

        if (current.getNext() != null) {
            current = current.getNext();
            step++;
            return current.getValue();
        }

        throw new CheckedException("Lista vazia amigão sinto muito.");
    }

    @Override
    public boolean hasNext() {
        return (current.getNext() != null) ? true : false; 
    }
    
}
