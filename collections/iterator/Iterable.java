package collections.iterator;

import collections.Stream;

public interface Iterable<E> {

    public Iterator<E> iterator();
    public Stream<E> stream();

}