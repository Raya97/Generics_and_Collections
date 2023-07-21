import java.util.ArrayList;
import java.util.List;

class MyEntry<K, V> {
    private final K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private List<List<MyEntry<K, V>>> buckets;
    private int size;

    public MyHashMap() {
        this.buckets = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets.add(new ArrayList<>());
        }
        this.size = 0;
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % buckets.size();
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        List<MyEntry<K, V>> bucket = buckets.get(index);

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new MyEntry<>(key, value));
        size++;

        // Check if we need to resize the buckets
        if ((double) size / buckets.size() >= LOAD_FACTOR) {
            resizeBuckets();
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        List<MyEntry<K, V>> bucket = buckets.get(index);

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        List<MyEntry<K, V>> bucket = buckets.get(index);

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public void clear() {
        buckets.clear();
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private void resizeBuckets() {
        int newCapacity = buckets.size() * 2;
        List<List<MyEntry<K, V>>> newBuckets = new ArrayList<>(newCapacity);

        for (int i = 0; i < newCapacity; i++) {
            newBuckets.add(new ArrayList<>());
        }

        for (List<MyEntry<K, V>> bucket : buckets) {
            for (MyEntry<K, V> entry : bucket) {
                int newIndex = entry.getKey().hashCode() % newCapacity;
                newBuckets.get(newIndex).add(entry);
            }
        }

        buckets = newBuckets;
    }
}
