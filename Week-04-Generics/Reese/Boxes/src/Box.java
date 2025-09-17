public class Box<T> {

    private T thing;

    public Box(T thingToWrap){
        this.thing = thingToWrap;
    }

    public T getThing() {
        return this.thing;
    }
}