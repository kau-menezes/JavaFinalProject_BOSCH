package collections;

public class LinkedList<T> extends List<T>{

    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public T get(int index) {

        if (index > size) {
            // estoura uma excessão
            return null;
        }

        // instancia um nó para percorer a lista
        Node<T> current = head;
        
        int i = 0;

        while (i != index) {
            current = current.getNext();
            i++;
        }

        return current.getValue();

    }
    @Override
    public void set(int index, T value) {
        
        if (index > size) {
            // estoura uma excessão
            return;
        }

        // instancia um nó para percorer a lista
        Node<T> current = head;
        
        int i = 0;

        while (i != index) {
            current = current.getNext();
            i++;
        }

        current.setValue(value);
       
    }

    @Override
    public void add(T value) {

        // instancia o nó
        Node<T> newnode = new Node<T>(value);
        size ++;

        if (head == null) {
            head = newnode;
            tail = head;
            return;
        }

        newnode.setPrevious(tail);
        tail.setNext(newnode);
        tail = newnode;
    }

}    
