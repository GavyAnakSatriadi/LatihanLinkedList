public class Node {
    double data;
    Node next;
    Node previous;

    public Node(double data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class DoubleLinkedList {
    private Node head;

    public DoubleLinkedList() {
        this.head = null;
    }

    public void insert(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void displayForward() {
        Node current = head;
        System.out.print("Linked List (forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.print("Linked List (backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        // Insert data into the Double Linked List
        doubleLinkedList.insert(10.5);
        doubleLinkedList.insert(20.8);
        doubleLinkedList.insert(30.2);

        // Display the Double Linked List in forward and backward order
        doubleLinkedList.displayForward();
        doubleLinkedList.displayBackward();
    }
}
