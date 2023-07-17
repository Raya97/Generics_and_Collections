public class MyHashMap {
    private Node[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size;

    public MyHashMap() {
        this.buckets = new Node[INITIAL_CAPACITY];
    }

    class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(Object key, Object value) {
        Node node = new Node(key, value);
        int bucket = getBucketIndex(key);
        Node existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = node;
            size++;
        } else {
            // обрабатываем коллизию с помощью связного списка
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = node;
                size++;
            }
        }
    }

    public Object get(Object key) {
        Node bucket = buckets[getBucketIndex(key)];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public void remove(Object key) {
        int bucketIndex = getBucketIndex(key);
        Node node = buckets[bucketIndex];

        if (node == null) {
            return;
        }

        if (node.key.equals(key)) {
            buckets[bucketIndex] = node.next;
            size--;
        } else {
            while (node.next != null) {
                if (node.next.key.equals(key)) {
                    node.next = node.next.next;
                    size--;
                    return;
                }
                node = node.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(Object key) {
        return key.hashCode() % buckets.length;
    }
}
