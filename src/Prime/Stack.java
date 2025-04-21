package Prime;

public class Stack {
    private Node head;
    private Node tail;
    private int length;

    public Stack() {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = head;
            head = newNode;
        }
        length++;  // FIXED
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = head.data;
        head = head.prev;

        if (this.isEmpty()) {
            tail = null;
        }

        length--;  // FIXED
        return value;
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return head.data;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    // Optional: to view length
    public int size() {
        return this.length;
    }

    // Inner Node class
    private static class Node {
        int data;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
        }
    }
}
