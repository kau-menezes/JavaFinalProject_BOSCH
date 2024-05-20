package collections;
import java.util.function.Function;

import collections.iterator.Iterable;

public class Stream<E> {

    private Iterable<E> iterable;
    public Stream(Iterable<E> iterable) {
        this.iterable = iterable;
    }

    // public <R> Stream<R> map(Function<E, R> func) {
        
    // }

    // public Stream<E> filter(Function<E, Boolean> func) {
    // }

    // public List<E> collect() {

    // }
}
