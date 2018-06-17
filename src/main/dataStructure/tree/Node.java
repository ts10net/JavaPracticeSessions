package main.dataStructure.tree;

public class Node {
    public Node left, right;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return data + " ";
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (null == left) {
                return false;
            } else {
                return left.contains(value);
            }
        } else if (value > data) {
            if (null == right) {
                return false;
            } else {
                return right.contains(value);
            }
        }
        return false;
    }

    public void printPreOrder() {
        System.out.print(this);
        if (null != left) left.printInOrder();
        if (null != right) right.printInOrder();
    }

    public void printInOrder() {
        if (null != left) left.printInOrder();
        System.out.print(this);
        if (null != right) right.printInOrder();
    }

    public void printPostOrder() {
        if (null != left) left.printInOrder();
        if (null != right) right.printInOrder();
        System.out.print(this);
    }
}
