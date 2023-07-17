import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void add(E value) {
        queue.addLast(value);
    }

    public void clear() {
        queue.clear();
    }

    public int size() {
        return queue.size();
    }

    public E peek() {
        return queue.peekFirst();
    }

    public E poll() {
        return queue.pollFirst();
    }
}
