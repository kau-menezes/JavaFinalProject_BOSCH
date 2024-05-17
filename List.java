public abstract class List<T> extends Origin {
    List() {
        super();
    }

    // mudar o get para retornar um T posteriormente
    abstract T get(int index);
    abstract void set(int index, T value);
    abstract void add(T value);
}
