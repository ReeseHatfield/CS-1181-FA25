import java.util.ArrayList;

public class CustomList<E> {
    // type composition
    private ArrayList<E> innerList = new ArrayList<>();


    public void add(E element){
        this.innerList.add(element);
    }

    public E get(int index) {
        return this.innerList.get(index);
    }

}