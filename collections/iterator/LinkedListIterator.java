package collections.iterator;
import collections.*;
import collections.exceptions.CheckedException;

public class LinkedListIterator<E> implements Iterator<E> {

    private LinkedList<E> linkedlist;
    private Node<E> current;
    private Integer step = -1;

    public LinkedListIterator(LinkedList<E> linkedlist){
        this.linkedlist = linkedlist;
        if(this.linkedlist != null){
            current = linkedlist.getHead();
        }
    }

    @Override
    public E next() throws CheckedException {

        if (linkedlist != null) {

            if(current.getNext() == null){
                throw new CheckedException("Não há próximo, campeão.");
            }

            step++;
    
            if (step != 0 && current.getNext() != null) {
                current = current.getNext();
            }
            return current.getValue();
        }

        throw new CheckedException("Lista vazia amigão, sinto muito.");
    }
    
    @Override
    public boolean hasNext() {
        if(linkedlist != null)
            return (current.getNext() != null) ? true : false; 
        throw new CheckedException("Lista vazia amigão, sinto muito.");
    }

}
