package general;

/**
 * SimpleLinkedList - A basic implementation of a linked list data structure
 * This class demonstrates how to implement a basic singly linked list in Java
 */
public class SimpleLinkedList {

    // Node class for the linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add a new element to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Add a new element to the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node with the given value
    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Print all elements in the list
    public void printList() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        System.out.println("Creating a linked list and adding some elements:");
        list.append(10);
        list.append(20);
        list.prepend(5);
        list.append(30);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("\nDeleting node with value 20:");
        list.delete(20);
        list.printList();

        System.out.println("\nDeleting node with value 5 (head):");
        list.delete(5);
        list.printList();
    }
}
