// import collections.iterator.*;
import java.util.Random;

import collections.*;
import collections.iterator.*;
import collections.iterator.Iterable;

public class Main {
    public static void main(String[] args) {
        int DEBUG = 50;
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


        Random ran = new Random();
        @SuppressWarnings("unused")
        Iterable<Integer> iterable = null;
        switch (ran.nextInt(5)) {
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

        List<Integer> result = iterable
        .stream()
        .filter(i -> i < 30)
        .collect();

        // Iterator<Integer> iterator = result.iterator();
        // while(iterator.hasNext()){
        // System.err.println(iterator.next());
        for(int i=0; i< result.getSize(); i++){
            System.err.println(result.get(i));
        }
    }
}