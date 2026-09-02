class Node {
    int data;
    Node next;

    // Node constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {

    Node head;

    // LinkedList constructor
    public LinkedList() {
        this.head = null;
    }

    // Check whether list is empty
    public boolean isListEmpty() {
        return head == null;
    }

    // Add node at front
    public void addToFront(int data) {

        Node newNode = new Node(data);

        if (isListEmpty()) {
            head = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Get front item
    public void getFrontItem() {

        if (isListEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        System.out.println("Front Item: " + head.data);
    }

    // Remove front item
    public void removeFrontItem() {

        if (isListEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Add node at back
    public void addToBack(int data) {

        Node newNode = new Node(data);

        if (isListEmpty()) {
            head = newNode;
        } 
        else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Remove node from back
    public void removeBackItem() {

        if (isListEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Print all nodes
    public void printAll() {

        if (isListEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}


public class LinkedList_Gpt {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Check empty
        System.out.println("Is empty? " + list.isListEmpty());

        // Add elements
        list.addToFront(30);
        list.addToFront(20);
        list.addToFront(10);

        System.out.println("After adding to front:");
        list.printAll();

        // Get front
        list.getFrontItem();

        // Add to back
        list.addToBack(40);

        System.out.println("After adding to back:");
        list.printAll();

        // Remove front
        list.removeFrontItem();

        System.out.println("After removing front:");
        list.printAll();

        // Remove back
        list.removeBackItem();

        System.out.println("After removing back:");
        list.printAll();
    }
}