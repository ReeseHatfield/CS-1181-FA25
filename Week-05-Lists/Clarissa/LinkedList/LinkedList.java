public class LinkedList<E> {
    private Node<E> head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(E headValue) {
        head = new Node<>(headValue);
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
        }
    }
}
