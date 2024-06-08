package Practice;

class Node {
    int data;
    Node next;

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
        return newNode;
    }

    



}

