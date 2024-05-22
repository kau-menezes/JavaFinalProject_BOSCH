package collections.iterator;

import collections.*;
import collections.exceptions.*;

public class StackIterator<T> implements Iterator<T> {

    private Stack<T> stack;
    private Integer step = -1;

    public StackIterator(Stack<T> stack){
        this.stack = stack;
    }

    public T next(){
        if(this.stack != null){
            if(hasNext()){
                this.step++;
                return stack.get(step);
            }
            throw new CheckedException("Acabou a pilha pae.");
        }
        throw new CheckedException("PILHA vazia amigão sinto muito.");
    }

    public boolean hasNext(){
        if(this.stack == null)
            return false;
        return step+1 < stack.getSize();
    }
    
}