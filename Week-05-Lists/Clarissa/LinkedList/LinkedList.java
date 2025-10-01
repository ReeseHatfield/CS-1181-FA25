public class LinkedList<E> {
    private Node<E> head;
    private int size = 0;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public LinkedList(E headValue) {
        head = new Node<>(headValue);
        size = 1;
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
        size++;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            int currIndex = 0;
            Node<E> currNode = head;
            while (currIndex < index) {
                currIndex++;
                currNode = currNode.getNext();
            }
            return currNode.getValue();
        }
    }

    public void replace(int index, E newValue) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            int currIndex = 0;
            Node<E> currNode = head;
            while (currIndex < index) {
                currIndex++;
                currNode = currNode.getNext();
            }
            currNode.setValue(newValue);
        }
    }

    @Override
    public String toString() {
        String list = "[";

        if (head == null) {
            list = "[]";
        } else {
            Node<E> currNode = head;
            for (int i = 0; i < size; i++) {
                if (i == (size - 1)) {
                    list = list + currNode.getValue() + "]";
                } else {
                    list = list + currNode.getValue() + ", ";
                }
                currNode = currNode.getNext();
            }
        }
        return list;
    }
}
