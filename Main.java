import collections.iterator.*;
import collections.*;

public class Main {



    public static void main(String[] args) {
        int DEBUG =20;


        LinkedList<Integer> linkedlist = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new Queue<>();

        for(int i = 0; i < DEBUG; i++)
        {
            linkedlist.add(i);
            stack.push(i);
            queue.enqueue(i);
        }

        System.out.printf("\n\ntamanho: %d\n\n", queue.getSize());

        // Linked List 
        for(int i = 0; i < 20; i++)
        {
            System.out.println(linkedlist.get(i));
        }

        //STACK & QUEUE
        System.out.println("\n\n\nSTACK\t|\tQUEUE");
        for(int i = 0; i < DEBUG + 2; i++) {
            System.out.println(stack.peek() + "\t|\t" + queue.dequeue() + " " +queue.getSize());
            // stack.pop();
        }

    }

    

}
