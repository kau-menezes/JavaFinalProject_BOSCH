package collections;

import collections.exceptions.CheckedException;
import collections.iterator.ArrayListIterator;
import collections.iterator.Iterable;
import collections.iterator.Iterator;

public class ArrayList<T> extends List<T> implements Iterable<T>
{

    private T[] data;

    @SuppressWarnings("unchecked")
    public ArrayList()
    {
        data = (T[])(new Object[10]);
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList( int capacity )
    {
        data = (T[])(new Object[capacity]);
    } 

    @Override
    public void add(T value)
    {   
        if ( size == data.length )
        {
            @SuppressWarnings("unchecked")
            T[] copy = (T[])( new Object[ data.length * 2 ]);

            for( int i = 0 ; i < size ; i++ )
            {
                copy[i] = this.data[i];
            }
        
        data = copy;
        }

        this.data[size] = value;
        this.size++;
    }

    @Override
    public T get(int index) throws CheckedException {
        
        if (index < this.size && index >= 0) {
            return this.data[index];
        }

        throw new CheckedException("Caiu fora dos bounds parça");
        
    }

    @Override
    public void set(int index, T value) {

        if (index < this.size && index >= 0) {
            this.data[index] = value;
        throw new CheckedException("índice inválido amigo :((");
        }
    }

    @Override
    public Iterator<T> iterator() {
        ArrayListIterator<T> array = new ArrayListIterator<T>(this);
        return array;
    }

    @Override
    public Stream<T> stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }
    
}
