package collections;

public class ArrayList<T> extends List<T>{

    T[] data;
    ArrayList()
    {
        super();
        data = (T[])(new Object[10]);
    }
    
    
    ArrayList( int capacity )
    {
        super();
        data = (T[])(new Object[capacity]);
    } 

    @Override
    void add(T value)
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
    T get(int index)
    {
        return this.data[index];
    }

    @Override
    void set(int index, T value)
    {
        this.data[index] = value;
    }
}
