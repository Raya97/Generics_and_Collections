import java.util.LinkedList;

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Node<K, V>>[] buckets;
    private int size;

    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        bucket.addLast(new Node<>(key, value));
        size++;
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i].clear();
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }
}
