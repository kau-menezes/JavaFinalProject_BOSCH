package collections.iterator;

import collections.*;
import collections.exceptions.CheckedException;

public class ArrayListIterator<E> implements Iterator<E> {

    ArrayList<E> array;
    int step = -1;

    public ArrayListIterator(ArrayList<E> array) {
        this.array = array;
    }

    @Override
    public E next() throws CheckedException {

        if(hasNext())
        {
            this.step++;
            return this.array.get(step);
        }
        
        throw new CheckedException("nao tem mais filhao");
        
    }
    
    @Override
    public boolean hasNext() {
        return (array.get(step + 1) == null) ? false : true;
    }
}
