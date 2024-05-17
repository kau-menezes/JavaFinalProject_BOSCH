package collections;

public class ArrayList<T> extends List<T>{

    private T[] data;

    public ArrayList()
    {
        data = (T[])(new Object[10]);
    }
    
    public ArrayList( int capacity )
    {
        data = (T[])(new Object[capacity]);
    } 

    @Override
    public void add(T value)
    {   
        if ( size == data.length )
        {
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
    public T get(int index)
    {
        return this.data[index];
    }

    @Override
    public void set(int index, T value)
    {
        this.data[index] = value;
    }
}
