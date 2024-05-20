package collections.iterator;

import collections.*;
import collections.exceptions.CheckedException;

public class ArrayListIterator<E> implements Iterator<E> {

    private ArrayList<E> array;
    private Integer step = -1;

    public ArrayListIterator(ArrayList<E> array) {
        this.array = array;
    }

    @Override
    public E next() throws CheckedException {
        
        if(!hasNext())
            throw new CheckedException("nao tem mais filhao");
        
        this.step++;
        return this.array.get(step);
    }
    
    @Override
    public boolean hasNext() {
        return step + 1 < array.getSize();
    }
}
