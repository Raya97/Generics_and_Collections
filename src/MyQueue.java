public class MyQueue {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Object value;
        Node next;

        Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }
        return head.value;
    }

    public Object poll() {
        if (size == 0) {
            return null;
        }
        Object value = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return value;
    }
}

