package main.dataStructure.list;

import main.programs.Utils;

import java.util.Arrays;

public class Runner {
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
