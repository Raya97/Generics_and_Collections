public class MyStack {
    private Object[] elements;
    private int size;

    public MyStack(int capacity) {
        elements = new Object[capacity];
    }

    public void push(Object value) {
        if (size == elements.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        elements[size] = value;
        size++;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Cannot peek from empty stack");
        }
        return elements[size - 1];
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        Object value = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null;
        size--;
    }
}

