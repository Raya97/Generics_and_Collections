public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Object value;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.value = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(Object value) {
        Node l = tail;
        Node newNode = new Node(l, value, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;
        size--;
    }

    public void clear() {
        for (Node x = head; x != null; ) {
            Node next = x.next;
            x.value = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp.value;
    }
}
