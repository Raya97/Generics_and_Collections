import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private List<Node<K, V>>[] buckets;
    private int size;

    public MyHashMap() {
        this.buckets = new List[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        List<Node<K, V>> bucket = getOrCreateBucket(index);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
        size++;

        if ((double) size / buckets.length >= LOAD_FACTOR) {
            resizeBuckets();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        List<Node<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        List<Node<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    bucket.remove(node);
                    size--;
                    return;
                }
            }
        }
    }

    public void clear() {
        buckets = new List[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % buckets.length);
    }

    private List<Node<K, V>> getOrCreateBucket(int index) {
        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }
        return buckets[index];
    }

    private void resizeBuckets() {
        int newCapacity = buckets.length * 2;
        List<Node<K, V>>[] newBuckets = new List[newCapacity];

        for (List<Node<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Node<K, V> node : bucket) {
                    int newIndex = node.key == null ? 0 : Math.abs(node.key.hashCode() % newCapacity);
                    List<Node<K, V>> newBucket = newBuckets[newIndex];
                    if (newBucket == null) {
                        newBucket = new ArrayList<>();
                        newBuckets[newIndex] = newBucket;
                    }
                    newBucket.add(node);
                }
            }
        }

        buckets = newBuckets;
    }

    private static class Node<K, V> {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
