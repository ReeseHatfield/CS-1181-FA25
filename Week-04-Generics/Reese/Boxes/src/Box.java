public class Box<T extends Comparable<T>, E> extends Pair<T, E> implements Comparable<Box<T, E>>{

    private T thing;

    public Box(T thingToWrap){
        this.thing = thingToWrap;
    }

    public T getThing() {
        return this.thing;
    }

    // @Override
    // public int compareTo(Box<T> other) {
    //     if(this.thing.doubleValue() > other.thing.doubleValue()) {
    //         return -1;
    //     }
    //     else if(this.thing.doubleValue() < other.thing.doubleValue()) {
    //         return 1;

    //     }
    //     else {
    //         return 0;
    //     }
    // }

    public String toString(){
        return this.thing.toString();
    }

    @Override
    public int compareTo(Box<T, E> arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}