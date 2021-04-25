package PracticalPart.SecondTask;

public class Elem <T> {
    public T value;
    public Elem<T> prev;
    public Elem<T> next;

    public Elem(T value) {
        this.value = value;
    }
}
