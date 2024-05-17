package collections.iterator;

public class ArrayListIterator<E> implements Iterator<E>{

    int step = -1;
    
    public E next()
    {
        if(hasNext())
        {
            step++;
        }
        
        return null;
    }

    public boolean hasNext() {
        return true;
    }
}
