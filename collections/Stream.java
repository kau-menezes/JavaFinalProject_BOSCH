package collections;
import java.util.function.Function;

import collections.iterator.Iterable;

public class Stream<E> {

    @SuppressWarnings("unused")
    private Iterable<E> iterable;

    public Stream(Iterable<E> iterable) {
        this.iterable = iterable;
    }

    public <R> Stream<R> map(Function<E, R> func) {
        return null;
        
    }

    public Stream<E> filter(Function<E, Boolean> func) {
        return null;

    }

    public List<E> collect() {
        LinkedList<E> list = new LinkedList<>();

        // TODO

        return list;
    }
}
