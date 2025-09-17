public class Pair<T1, T2> {

    private T1 thing1;
    private T2 thing2;

    public void setThing1(T1 thing){
        this.thing1 = thing;
    }

    public void setThing2(T2 thing) {
        this.thing2 = thing;
    }


    public T1 getThing1(){
        return this.thing1;
    }

    public T2 getThing2(){
        return this.thing2;
    }


}