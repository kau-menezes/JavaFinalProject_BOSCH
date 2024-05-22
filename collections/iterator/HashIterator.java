package collections.iterator;
import collections.*;
import collections.exceptions.CheckedException;

public class HashIterator<T> implements Iterator<T>{
    private LinkedList<HashNode<T>>[] hash;
    private Integer i = 0;
    private Integer j = -1;

    public HashIterator(LinkedList<HashNode<T>>[] hash){
        this.hash = hash;
    }

    @Override
    public T next(){
        if (!testNext(i, j, true))
            throw new CheckedException("indice inválido paizão");
        return hash[i].get(j).getValue();
    }
        
        
    public boolean hasNext(){
        return testNext(i, j, false);
    }

    private boolean testNext(Integer i, Integer j, Boolean update) {
        if (i >= this.hash.length)
            return false;
        LinkedList<HashNode<T>> list = this.hash[i];
        
        while (list == null && i < this.hash.length) {
            i++;
            j = -1;
            list = this.hash[i];
        }
        if (list == null)
            return false;
        
        j++;
        if (j < list.getSize())
        {
            if (update) {
                this.i = i;
                this.j = j;
            }   
            return true;
        }
        
        return testNext(i + 1, -1, update);
    }
}
