
public class CustomLinkedList<T> {
    private Node<T> head;

    public CustomLinkedList() {
        head = null;
    }


    public void add(T thingToAdd){

        // if cond
            // early return

        // if cond
            // early return

        // handle the more general case
        

        if(this.head == null){
            this.head = new Node<T>(thingToAdd);
            return;
        }


        // by the time this loop is over
        // cur = last value in the list
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = new Node<T>(thingToAdd);
    }


    public T getFirst(){
        return this.head.getData();
    }

    public T get(int index) {

        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next; // needs to execute index number of times
        }

        return current.data;
    }


    public String toString(){
        String s = "";

        // s += this.head.toString();

        Node<T> current = head;
        while(current != null){

            s += current.data.toString();
            s += " ";

            current = current.next;
        }


        return s;
    }



}


class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public T getData(){
        return this.data;
    }


    @Override
    public String toString() {
        return this.data.toString();
    }
}
