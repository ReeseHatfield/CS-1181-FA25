
public class Node<T> {
    private T data;
    private Node<T> next;

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
