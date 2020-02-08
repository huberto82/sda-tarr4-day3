package generic;

public class MagicArray<T> {
    private T[] array;

    public MagicArray(T[] array) {
        this.array = array;
    }

    public void putAt(T item, int index){
        array[index] = item;
    }

    public T getAt(int index){
        return array[index];
    }
}
