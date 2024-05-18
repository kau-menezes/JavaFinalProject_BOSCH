package collections.iterator;

public interface IterableBanana<E> {

    Iterator<E> iterator();

    Stream<E> stream();

}