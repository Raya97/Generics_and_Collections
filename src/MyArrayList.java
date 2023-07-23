import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(E value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    public void clear() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) data[index];
    }
}

