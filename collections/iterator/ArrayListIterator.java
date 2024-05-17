package collections.iterator;

import collections.*;

public class ArrayListIterator<E> implements Iterator<E>{

    ArrayList<E> array;
    int step = -1;

    public ArrayListIterator(ArrayList<E> array) {
        this.array = array;
    }

    @Override
    public E next()
    {
        if(hasNext())
        {
            this.step++;
            return this.array.get(step);
        }
        
        //Estourar erro 'Checked'
        return null;
    }
    
    @Override
    public boolean hasNext() {
        return (array.get(step + 1) == null) ? false : true;
    }
}
