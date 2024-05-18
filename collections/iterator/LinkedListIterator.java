package collections.iterator;

import collections.*;
import collections.exceptions.CheckedException;

public class LinkedListIterator<E> implements Iterator<E> {

    LinkedList<E> linkedlist;
    Node<E> current;
    int step = -1;

    @Override
    public E next() throws CheckedException {

        if (linkedlist != null) {

            step++;
    
            if (step == 0) {
                current = linkedlist.getHead();
                return current.getValue();
            }
    
            if (current.getNext() != null) {
                current = current.getNext();
                step++;
                return current.getValue();

            } else {
                throw new CheckedException("Não há próximo campeão.");
                
            }
        }

        throw new CheckedException("Lista vazia amigão sinto muito.");
    }

    @Override
    public boolean hasNext() {
        return (current.getNext() != null) ? true : false; 
    }

}
