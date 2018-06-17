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
        while (null != pointerNode.nextNode && data != pointerNode.data) {
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

            if (currentNode.data == data) {
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

    public static void main(String[] args) {
        integerListTest();
        stringListTest();
    }

    private static void integerListTest() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        int[] intArray = Utils.randomizeArray(10);
        intArray[0] = intArray[1];

        System.out.println("Array: " + Arrays.toString(intArray));
        for (int num : intArray) {
            linkedList.insert(num);
        }

        System.out.print("Linked list: ");
        linkedList.print();

        //int removeNode = intArray[intArray.length / 2];

        System.out.println("Remove last: " + intArray[intArray.length - 1]);
        linkedList.remove(intArray[intArray.length - 1]);
        System.out.print("Linked list: ");
        linkedList.print();

        System.out.println("Remove first: " + intArray[0]);
        linkedList.remove(intArray[0]);
        System.out.print("Linked list: ");
        linkedList.print();

        System.out.println("Remove mid: " + intArray[intArray.length / 2]);
        linkedList.remove(intArray[intArray.length / 2]);
        System.out.print("Linked list: ");
        linkedList.print();
    }

    private static void stringListTest(){
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insert("Z");
        linkedList.insert("C");
        linkedList.insert("M");
        linkedList.insert("P");
        linkedList.insert("A");

        System.out.print("\n\nString List: ");
        linkedList.print();


        System.out.println("Remove last at: " + (linkedList.size()-1));
        linkedList.remove("A");
        System.out.print("Linked list: ");
        linkedList.print();

        System.out.println("Remove first: " + "Z");
        linkedList.remove("Z");
        System.out.print("Linked list: ");
        linkedList.print();

        System.out.println("New size: " + linkedList.size());
/*
        System.out.println("Remove mid: " + intArray[intArray.length / 2]);
        linkedList.remove(intArray[intArray.length / 2]);
        System.out.print("Linked list: ");
        linkedList.print();*/
    }
}
