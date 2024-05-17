public class LinkedList<T> extends List<T>{
    
    LinkedList()
    {
        super();
    }

    Node<T> head = null;
    Node<T> tail = null;

    @Override
    T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    @Override
    void set(int index, T value) {
        
        
       
    }
    @Override
    void add(T value) {

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
