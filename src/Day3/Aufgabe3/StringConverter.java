package Day3.Aufgabe3;

public abstract class StringConverter<T> {

    abstract String toString(T obj);
    abstract T fromString(String obj);
}
