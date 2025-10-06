public class Box<T extends Train<T>, E extends Comparable<T>> {
    private T item;
    private E item2;


    public T getItem() {
        return item;    
    }


    public Box(T item) {
        this.item = item;
    }
}
