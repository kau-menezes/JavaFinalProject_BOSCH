package collections;

import collections.iterator.Iterable;
import collections.iterator.Iterator;
import collections.iterator.QueueIterator;

public class Stack<T> extends Origin implements Iterable<T>
{
    private T[] data;

    @SuppressWarnings("unchecked")
    public Stack()
    {
        data = (T[])(new Object[10]);
    }
    
    @SuppressWarnings("unchecked")
    public Stack( int capacity )
    {
        data = (T[])(new Object[capacity]);
    } 

    public void push(T value)
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

    public T get(int index)
    {
        return this.data[index];
    }

    public void set(int index, T value)
    {
        this.data[index] = value;
    }

    public void pop(){

        if (this.size == 0) 
            return;   
        
        this.size--;
    }        

    public T peek(){
        if(this.size == 0)
            return null;
        
        return data[size - 1];

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Stream<T> stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }
}
