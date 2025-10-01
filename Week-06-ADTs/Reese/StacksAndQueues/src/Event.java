public class Event implements Comparable<Event>{
    public Integer time;

    public Event(Integer time){
        this.time = time;
    }

    @Override
    public int compareTo(Event other) {
        return this.time.compareTo(other.time);
    }
}
