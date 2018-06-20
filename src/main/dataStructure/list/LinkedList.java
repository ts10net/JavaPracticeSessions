package main.dataStructure.list;

import main.programs.Utils;

import java.util.Arrays;

/***
 * Notes:
 */
public class LinkedList<E> {
    private Node<E> head;
    private int size;

    public void insert(E data) {
        Node<E> newNode = new Node<E>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node pointerNode = head;

            while (pointerNode.nextNode != null) {
                pointerNode = pointerNode.nextNode;
            }

            pointerNode.nextNode = newNode;
        }

        size++;
    }

    public Node<E> find(E data) {
        if (head.data == data) return head;

        Node<E> pointerNode = head;
        while (null != pointerNode.nextNode && !data.equals(pointerNode.data)) {
            pointerNode = pointerNode.nextNode;
        }

        return pointerNode;
    }

    public void remove(E data) {
        Node<E> preNode = null;
        Node<E> currentNode = head;
        Node<E> nextNode = currentNode.nextNode;

        do {

            System.out.println("prev: " + preNode + ", curr: " + currentNode + ", next: " + nextNode);

            if (data.equals(currentNode.data)) {
                // remove
                System.out.println("...Removing current: " + data);
                if (currentNode == head) {
                    head = currentNode.nextNode;
                    currentNode = head;
                }else {
                    preNode.nextNode = currentNode.nextNode;
                }
                size--;
            }

            preNode = currentNode;
            currentNode = nextNode;
            nextNode = (null == currentNode) ? null : currentNode.nextNode;

        } while (currentNode != null);
    }

    public void print() {
        Node<E> pointerNode = head;

        do {
            System.out.print(pointerNode);
            pointerNode = pointerNode.nextNode;
        } while (pointerNode.hasNext());

        System.out.print(pointerNode);
    }

    public int size(){
        return size;
    }

}
