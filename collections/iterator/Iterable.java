package collections.iterator;

public interface Iterable<E> {

    Iterator<E> iterator();

    Stream<E> stream();

}