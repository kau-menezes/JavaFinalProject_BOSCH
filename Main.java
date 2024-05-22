// import collections.iterator.*;
import java.util.Random;

import collections.*;
import collections.iterator.*;
import collections.iterator.Iterable;

public class Main {
    public static void main(String[] args) {
        int DEBUG = 21;
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new Queue<>();
        Hash<Integer> hash = new Hash<>();
        ArrayList<Integer> arraylist = new ArrayList<>();

        for(int i = 0; i < DEBUG; i++)
        {
            linkedlist.add(i);
            stack.push(i);
            queue.enqueue(i);
            hash.add(i,i);
            arraylist.add(i);
        }

        @SuppressWarnings("unused")
        Iterable<Integer> iterable = null;
        switch (3) {
            case 0:
                iterable = linkedlist;
                break;
            case 1:
                iterable = stack;
                break;
            case 2:
                iterable = queue;
                break;
            case 3:
                iterable = hash;
                break;
            default:
                iterable = arraylist;
                break;
        }

        // Iterator<Integer> interator = iterable.iterator();

        // while(interator.hasNext()){
        //     System.err.println(interator.next());
        // }
        
        // // List<Character> result = iterable
        // //     .stream()
        // //     .map(i -> i.toString())
        // //     .map(s -> s.charAt(0))
        // //     .filter(c -> c == '7')
        // //     .collect();
    }
}
