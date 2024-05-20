package collections.iterator;
import collections.*;
import collections.exceptions.CheckedException;

public class HashIterator<T> implements Iterator<T>{
    private ArrayList<T>[] hash;
    private Integer i = 0;
    private Integer j = -1;

    public HashIterator(ArrayList<T>[] hash){
        this.hash = hash;
    }

    @Override
    public T next(){
        if (testNext(i, j))
            throw new CheckedException("indice inválido paizão");
        
        ArrayList<T> list = this.hash[i];
        while (list == null && i < this.hash.length) {
            i++;
            j = -1;
            list = this.hash[i];
        }
        if (list == null)
            throw new CheckedException("indice inválido paizão");
        
        j++;
        return this.hash[i].get(j);
    }
    
    @Override
    public boolean hasNext(){
        return testNext(i, j);
    }

    private boolean testNext(Integer i, Integer j) {
        ArrayList<T> list = this.hash[i];
        while (list == null && i < this.hash.length) {
            i++;
            j = -1;
            list = this.hash[i];
        }
        if (list == null)
            return false;
        
        j++;
        if (j < list.getSize())
            return true;
        
        return testNext(i + 1, -1);
    }
}
