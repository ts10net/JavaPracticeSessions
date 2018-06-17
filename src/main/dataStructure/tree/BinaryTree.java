package main.dataStructure.tree;

public class BinaryTree {
    Node root;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (null == root) {
            root = newNode;
        } else {
            Node lookupNode = root;
            Node parentNode;

            while (true) {
                parentNode = lookupNode;
                if (data < lookupNode.data) {
                    // left
                    lookupNode = parentNode.left;
                    if (null == lookupNode) {
                        parentNode.left = newNode;
                        return;
                    }
                } else {
                    // right
                    lookupNode = parentNode.right;
                    if (null == lookupNode) {
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findNode(int data) {
        Node lookupNode = root;
        while (null != lookupNode && lookupNode.data != data) {
            if (data < lookupNode.data) {
                lookupNode = lookupNode.left;
            } else {
                lookupNode = lookupNode.right;
            }
        }

        return lookupNode;
    }

    public Node getRoot(){
        return root;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(5);
        binaryTree.addNode(1);
        binaryTree.addNode(3);
        binaryTree.addNode(7);
        binaryTree.addNode(2);
        binaryTree.addNode(10);

        Node rootNode = binaryTree.getRoot();
        System.out.println("\nPre order traversal: " + rootNode);
        rootNode.printPreOrder();

        System.out.println("\nIn order traversal: " + rootNode);
        rootNode.printInOrder();

        System.out.println("\nPost order traversal: " + rootNode);
        rootNode.printPostOrder();
    }
}
