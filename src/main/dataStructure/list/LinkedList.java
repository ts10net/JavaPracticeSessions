package main.dataStructure.list;

import main.programs.Utils;

import java.util.Arrays;

/***
 * Notes:
 */
public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node pointerNode = head;

            while (pointerNode.nextNode != null) {
                pointerNode = pointerNode.nextNode;
            }

            pointerNode.nextNode = newNode;
        }
    }

    public Node find(int data) {
        if (head.data == data) return head;

        Node pointerNode = head;
        while (null != pointerNode.nextNode && data != pointerNode.data) {
            pointerNode = pointerNode.nextNode;
        }

        return pointerNode;
    }

    public void remove(int data) {
        Node preNode = null;
        Node currentNode = head;
        Node nextNode = currentNode.nextNode;

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
            }

            preNode = currentNode;
            currentNode = nextNode;
            nextNode = (null == currentNode) ? null : currentNode.nextNode;

        } while (currentNode != null);
    }

    public void print() {
        Node pointerNode = head;

        do {
            System.out.print(pointerNode);
            pointerNode = pointerNode.nextNode;
        } while (pointerNode.hasNext());

        System.out.print(pointerNode);
    }

    public static void main(String[] args) {
        int[] intArray = Utils.randomizeArray(10);
        intArray[0] = intArray[1];

        System.out.println("Array: " + Arrays.toString(intArray));

        LinkedList linkedList = new LinkedList();

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
}
