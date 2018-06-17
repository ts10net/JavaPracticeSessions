package main.dataStructure.list;

public class Node<E> {
    E data;
    Node nextNode;

    public Node(E data) {
        this.data = data;
    }

    public boolean hasNext() {
        return null != nextNode;
    }

    @Override
    public String toString() {
        return (data + " ");
    }
}
