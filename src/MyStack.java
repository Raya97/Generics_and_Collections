import java.util.LinkedList;

public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(E value) {
        stack.addFirst(value);
    }

    public void remove(int index) {
        if (index < 0 || index >= stack.size()) {
            throw new IndexOutOfBoundsException();
        }
        stack.remove(index);
    }

    public void clear() {
        stack.clear();
    }

    public int size() {
        return stack.size();
    }

    public E peek() {
        return stack.peekFirst();
    }

    public E pop() {
        return stack.pollFirst();
    }
}

