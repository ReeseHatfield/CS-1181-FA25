public class Counter {
    private int value = 0;

    public synchronized void increment(){
        this.value += 1;
    }

    public int getValue(){
        return this.value;
    }
}
