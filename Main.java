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
            hash.add(i);
            arraylist.add(i);
        }

        Iterable<Integer> iterable = null;
        switch (new Random().nextInt(5)) {
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
        
        // List<String> result = iterable
        //     .stream()
        //     .map(i -> i.toString())
        //     .filter(s -> s.length() < 2)
        //     .collect();
    }
}
