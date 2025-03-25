package com.test;

class DoublyLinkedList {
	class Node {
	    int data;
	    Node prev;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from the end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete a specific node
    public void deleteNode(Node delNode) {
        if (head == null || delNode == null) {
            System.out.println("Node to be deleted is NULL.");
            return;
        }
        if (delNode == head) {
            head = delNode.next;
        }
        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }
        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }
    }

    // Forward Traversal
    public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Backward Traversal
    public void traverseBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);

        System.out.print("Forward Traversal: ");
        dll.traverseForward();

        System.out.print("Backward Traversal: ");
        dll.traverseBackward();

        dll.insertAtEnd(40);
        dll.insertAtEnd(50);

        System.out.print("After inserting at end: ");
        dll.traverseForward();

        dll.deleteFromBeginning();
        System.out.print("After deleting from beginning: ");
        dll.traverseForward();

        dll.deleteFromEnd();
        System.out.print("After deleting from end: ");
        dll.traverseForward();
    }
}
