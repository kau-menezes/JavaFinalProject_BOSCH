import collections.iterator.*;
import collections.*;

public class Main {

    public static void main(String[] args) {

        // Linked List 

        LinkedList<Integer> linkedlist = new LinkedList<>();

        for(int i = 0; i < 20; i++)
        {
            linkedlist.add(i);
        }

        for(int i = 0; i < 20; i++)
        {
            System.out.println(linkedlist.get(i));
        }

        System.out.println("\n------------");

        linkedlist.set(4,999999);
    
        for(int i = 0; i < 20; i++)
        {
            System.out.println(linkedlist.get(i));
        }


    }

    

}
