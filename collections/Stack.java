package collections;

public class Stack<T> extends Origin
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

        return data[size - 1];        
    }
}
