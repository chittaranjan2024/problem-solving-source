package com.test;

class CircularLinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last;

    // Constructor
    public CircularLinkedList() {
        this.last = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (last == null) { // If list is empty
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) { // If list is empty
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        if (last.next == last) { // Only one node
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        if (last.next == last) { // Only one node
            last = null;
        } else {
            Node temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    // Display the list
    public void display() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(back to start)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.display();

        cll.insertAtBeginning(5);
        cll.display();

        cll.deleteFromBeginning();
        cll.display();

        cll.deleteFromEnd();
        cll.display();
    }
}
