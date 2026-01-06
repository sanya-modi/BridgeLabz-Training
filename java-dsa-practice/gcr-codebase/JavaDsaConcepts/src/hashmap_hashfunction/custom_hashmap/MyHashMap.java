package hashmap_hashfunction.custom_hashmap;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    // ---------------- HASH FUNCTION ----------------
    private int getBucketIndex(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % buckets.length;
    }

    // ---------------- PUT ----------------
    public void put(K key, V value) {

        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];

        // Check if key already exists
        Entry<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value; // update
                return;
            }
            current = current.next;
        }

        // Insert new entry at head
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = head;
        buckets[index] = newEntry;
        size++;
    }

    // ---------------- GET ----------------
    public V get(K key) {

        int index = getBucketIndex(key);
        Entry<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // key not found
    }

    // ---------------- REMOVE ----------------
    public void remove(K key) {

        int index = getBucketIndex(key);
        Entry<K, V> current = buckets[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {

                // Remove head
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }

                size--;
                return;
            }

            prev = current;
            current = current.next;
        }
    }

    // ---------------- SIZE ----------------
    public int size() {
        return size;
    }
}

