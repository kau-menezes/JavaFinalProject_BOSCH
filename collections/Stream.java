package collections;
import java.util.function.Function;
import collections.iterator.*;
import collections.iterator.Iterable;

public class Stream<E> {

    private Iterable<E> iterable;

    public Stream(Iterable<E> iterable) {
        this.iterable = iterable;
    }

    public <R> Stream<R> map(Function<E, R> func) {
        
        ArrayList<R> arraylistzinha = new ArrayList<>();

        Iterator<E> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            arraylistzinha.add(func.apply(iterator.next()));
        }

        return arraylistzinha.stream();


    }

    public Stream<E> filter(Function<E, Boolean> func) {
        ArrayList<E> arraylistzinha = new ArrayList<>();
        Iterator<E> iterator = iterable.iterator();

        while(iterator.hasNext()) {
            E next = iterator.next();
            if (func.apply(next)) {
                arraylistzinha.add(next);
            }
        }

        return arraylistzinha.stream();

    }

    public List<E> collect() {
        ArrayList<E> arraylistzinha = new ArrayList<>();
        Iterator<E> iterator = iterable.iterator();
        
        while (iterator.hasNext()) {
            arraylistzinha.add(iterator.next());
        }

        return arraylistzinha;


    }
}
