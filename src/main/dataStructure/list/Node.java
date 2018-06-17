package main.dataStructure.list;

public class Node {
    int data;
    Node nextNode;

    public Node(int data) {
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
