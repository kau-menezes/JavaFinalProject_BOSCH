package collections;

public class Queue<T> {

    private int size = 0;
    Node <T>head = null;
    Node <T>tail = null;

    public T dequeue() {
        
        size--;

        if (size == 0) {
            head = null;
        }

        head = head.getNext();
        return head.getValue();
    }

    public void printQueue() {

        Node<T> current = head;
        for (int i = 0; i < size; i++) {

            System.out.println(current.getValue());
            current = current.getNext();

        }

    }

    public T peek() {
        return head.getValue();
    }

    public int getSize() {
        return size;
    }

}


